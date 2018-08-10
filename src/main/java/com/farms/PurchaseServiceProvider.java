/*
 * Developed  by Kiran Yedavalli on 8/9/18 11:11 PM
 * Last Modified 8/9/18 11:11 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms;

import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import com.farms.models.purchase.PurchaseDTO;
import com.farms.models.rest.ResponseDTO;
import com.farms.models.rest.RestMethods;
import com.farms.models.rest.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.function.Function;

import static com.farms.models.Utils.getObjectFromJsonString;

public class PurchaseServiceProvider implements RestServiceProvider {

    private final Logger logger = LoggerFactory.getLogger(PurchaseServiceProvider.class);
    private final String path = "farm/purchase-info";

    public PurchaseServiceProvider(){}

    @Override
    public String getPath() {
        return path;
    }

    private Function<PurchaseDTO, Optional<RestResponse>> postBehavior = i -> {
        String id = i.getPropertyDetails().getAddress().stringify();
        i.setId(id);
        // TODO: Send it for processing
        return Optional.of(new RestResponse(new ResponseDTO().setId(id), StatusCodes.ACCEPTED));
    };

    private Function<PurchaseDTO, Optional<RestResponse>> putBehavior = i -> {
        // TODO: Send it for processing
        return Optional.of(new RestResponse(new ResponseDTO().setId(i.getId()), StatusCodes.ACCEPTED));
    };

    private Optional<RestResponse> handlePostPutRequest(PurchaseDTO dto, Function<PurchaseDTO, Optional<RestResponse>> behavior){
        return behavior.apply(dto);
    }

    private boolean isPostRequestBodyValid(PurchaseDTO info){
        //TODO: complete this
        return true;
    }

    private boolean isPutRequestBodyValid(PurchaseDTO info){
        //TODO: complete this
        return true;
    }

    @Override
    public Optional<RestResponse> processRestcall(String method, String body, HttpRequest request) {
        PurchaseDTO info = getObjectFromJsonString(body, PurchaseDTO.class);
        Optional<String> id = request.getUri().query().get("id");
        logger.debug(info.toString());
        switch(RestMethods.valueOf(method)){
            case POST:
                if(isPostRequestBodyValid(info)) return handlePostPutRequest(info, postBehavior);
                break;
            case PUT:
                if(isPutRequestBodyValid(info)) return handlePostPutRequest(info, putBehavior);
                break;
            case DELETE:
                if(id.isPresent()){

                }
                break;
            case GET:
                break;
            default:
                logger.error("Unknown Method!!!");
        }
        return Optional.of(new RestResponse(null, StatusCodes.BAD_REQUEST));
    }
}
