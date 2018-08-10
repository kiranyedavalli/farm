/*
 * Developed  by Kiran Yedavalli on 8/10/18 7:23 AM
 * Last Modified 8/10/18 7:21 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider;

import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import com.farms.models.purchase.PropertyDTO;
import com.farms.models.infra.rest.ResponseDTO;
import com.farms.models.infra.rest.RestMethods;
import com.farms.models.infra.rest.RestResponse;
import com.farms.models.infra.rest.RestServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.function.BiFunction;

import static com.farms.models.infra.Utils.getObjectFromJsonString;

public class PurchaseRestServiceProvider implements RestServiceProvider {

    private final Logger logger = LoggerFactory.getLogger(PurchaseRestServiceProvider.class);
    private final String path = "farm/purchase-info";

    public PurchaseRestServiceProvider(){}

    @Override
    public String getPath() {
        return path;
    }

    private boolean isPostRequestValid(PropertyDTO dto){
        //TODO: complete this
        return true;
    }

    private boolean isPutRequestValid(PropertyDTO dto){
        //TODO: complete this
        return true;
    }

    private Optional<PropertyDTO> getPurchaseDTOById(String id){
        //TODO: complete this
        return null;
    }

    private BiFunction<PropertyDTO, String, Optional<RestResponse>> postPutBehavior = (dto, method) -> {
        switch(RestMethods.valueOf(method)){
            case POST:
                if(!isPostRequestValid(dto)) return Optional.of(new RestResponse(
                        new ResponseDTO().setMessage("Request is not valid"),StatusCodes.BAD_REQUEST));
                String id = dto.getPropertyDetails().getAddress().stringify();
                dto.setId(id);
                break;
            case PUT:
                if(!isPutRequestValid(dto)) return Optional.of(new RestResponse(
                        new ResponseDTO().setMessage("Request is not valid"),StatusCodes.BAD_REQUEST));
                break;
            default:
                logger.error("Unknown RestMethod!!!");
                return Optional.of(new RestResponse(null, StatusCodes.BAD_REQUEST));
        }
        // TODO: Send it for processing
        return Optional.of(new RestResponse(new ResponseDTO().setId(dto.getId()), StatusCodes.ACCEPTED));
    };

    private BiFunction<Optional<String>, String, Optional<RestResponse>> deleteGetBehavior = (id, method) -> {
        if(!id.isPresent()){
            return Optional.of(new RestResponse(null, StatusCodes.BAD_REQUEST));
        }
        Optional<PropertyDTO> dto = getPurchaseDTOById(id.get());
        if(!dto.isPresent()){
            return Optional.of(new RestResponse(null, StatusCodes.NOT_FOUND));
        }
        switch(RestMethods.valueOf(method)){
            case DELETE:
                //TODO: Send it for processing
                return Optional.of(new RestResponse(new ResponseDTO().setId(id.get()), StatusCodes.ACCEPTED));
            case GET:
                return Optional.of(new RestResponse(dto.get(), StatusCodes.OK));
            default:
                logger.error("Unknown RestMethod!!!");
                return Optional.of(new RestResponse(null, StatusCodes.BAD_REQUEST));
        }
    };


    private Optional<RestResponse> handlePostPutRequest(PropertyDTO dto, String method,
                                                        BiFunction<PropertyDTO, String,
                                                                Optional<RestResponse>> behavior){
        return behavior.apply(dto, method);
    }

    private Optional<RestResponse> handleDeleteGetRequest(Optional<String> id, String method,
                                                          BiFunction<Optional<String>, String,
                                                                  Optional<RestResponse>> behavior){
        return behavior.apply(id, method);
    }


    @Override
    public Optional<RestResponse> processRestcall(String method, String body, HttpRequest request) {
        PropertyDTO info = getObjectFromJsonString(body, PropertyDTO.class);
        Optional<String> id = request.getUri().query().get("id");
        logger.debug(info.toString());
        switch(RestMethods.valueOf(method)){
            case POST:
            case PUT:
                return handlePostPutRequest(info, method, postPutBehavior);
            case DELETE:
            case GET:
                return handleDeleteGetRequest(id, method, deleteGetBehavior);
            default:
                logger.error("Unknown Method!!!");
        }
        return Optional.of(new RestResponse(null, StatusCodes.BAD_REQUEST));
    }
}
