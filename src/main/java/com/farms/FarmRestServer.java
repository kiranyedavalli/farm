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
import com.farms.models.rest.AbstractFarmRestServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class FarmRestServer extends AbstractFarmRestServer {

    private final Logger logger = LoggerFactory.getLogger(FarmRestServer.class);
    private ConcurrentHashMap<String, RestServiceProvider> restServiceProviders = new ConcurrentHashMap<>();

    private RestServiceProvider getRestServiceProvider(String path){
        return restServiceProviders.getOrDefault(path, null);
    }

    public FarmRestServer(ActorSystem system, String host, int port, boolean useHttps){
        super(system, host, port, useHttps);
    }

    @Override
    protected Route handleRestCall(String method, String body, HttpRequest request){
        String path = request.getUri().getPathString();
        logger.debug("Received URL patn {}", path);
        RestServiceProvider sp = getRestServiceProvider(path);
        if(sp!=null){
            return sp.processRestcall(method,body);
        }
        return complete(StatusCodes.NOT_FOUND,"Service not supported");
    }
}
