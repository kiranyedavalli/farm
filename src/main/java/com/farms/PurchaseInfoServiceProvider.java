/*
 * Developed  by Kiran Yedavalli on 8/9/18 11:11 PM
 * Last Modified 8/9/18 11:11 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms;

import akka.actor.ActorSystem;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.Route;
import com.farms.models.purchase.PurchaseInfo;
import com.farms.models.rest.RestMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.farms.models.Utils.getObjectFromJsonString;

public class PurchaseInfoServiceProvider implements RestServiceProvider {

    private final Logger logger = LoggerFactory.getLogger(PurchaseInfoServiceProvider.class);
    private final String path = "farm/purchase-info";

    public PurchaseInfoServiceProvider(){}

    @Override
    public String getPath() {
        return path;
    }

    private boolean isPostRequestBodyValid(PurchaseInfo info){
        //TODO: complete this
        return true;
    }

    @Override
    public Route processRestcall(String method, String body) {
        PurchaseInfo info = getObjectFromJsonString(body, PurchaseInfo.class);
        logger.debug(info.toString());
        switch(RestMethods.valueOf(method)){
            case POST:
                if(isPostRequestBodyValid(info)) {
                    info.setId(info.getPropertyDetails().getAddress().stringify());
                    // Send it for processing
                    return complete(StatusCodes.ACCEPTED, "Request accepted for processing");
                }
                break;
            case PUT:
                break;
            case DELETE:
                break;
            case GET:
                break;
            default:
                logger.error("Unknown Method!!!");
        }
        return complete(StatusCodes.BAD_REQUEST, "Bad Request");
    }
}
