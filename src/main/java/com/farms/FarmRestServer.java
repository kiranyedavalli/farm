/*
 * Developed  by Kiran Yedavalli on 8/9/18 7:56 PM
 * Last Modified 8/9/18 7:56 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms;

import akka.actor.ActorSystem;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.Route;
import com.farms.models.exceptions.FarmException;
import com.farms.models.rest.AbstractFarmRestServer;
import com.farms.models.rest.RestResponse;
import com.farms.models.rest.RestServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import static com.farms.models.Utils.getJsonStringFromObject;

public class FarmRestServer extends AbstractFarmRestServer {

    private final Logger logger = LoggerFactory.getLogger(FarmRestServer.class);
    private ConcurrentHashMap<String, Optional<RestServiceProvider>> restServiceProviders = new ConcurrentHashMap<>();

    public void addRestServiceProvider(Optional<RestServiceProvider> provider){
        if(!provider.isPresent()) {
            logger.error("Cannot add RestServiceProvider");
            throw new FarmException("Cannot add RestServiceProvider");
        }
        restServiceProviders.put(provider.get().getPath(), provider);
        logger.debug("Added RestServiceProvider for {}", provider.get().getPath());
    }

    private Optional<RestServiceProvider> getRestServiceProvider(String path){
        return restServiceProviders.getOrDefault(path, null);
    }

    public FarmRestServer(ActorSystem system, String host, int port, boolean useHttps){
        super(system, host, port, useHttps);
    }

    @Override
    protected Route handleRestCall(String method, String body, HttpRequest request){
        String path = request.getUri().getPathString();
        logger.debug("Received URL patn {}", path);
        Optional<RestServiceProvider> sp = getRestServiceProvider(path);
        if(sp.isPresent()){
            logger.debug("Found the RestServiceProvider for {}", path);
            Optional<RestResponse> response = sp.get().processRestcall(method, body, request);
            if(response.isPresent()){
                return complete(response.get().getStatusCode(), getJsonStringFromObject(response.get().getResponse()));
            }
        }
        logger.debug("No RestServiceProvider found for {}", path);
        return complete(StatusCodes.NOT_FOUND,"Service not supported");
    }
}
