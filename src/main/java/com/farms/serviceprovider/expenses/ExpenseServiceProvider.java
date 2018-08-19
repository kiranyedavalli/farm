/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:22 PM
 * Last Modified 8/17/18 10:22 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.expenses;

import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.StatusCodes;
import com.farms.models.common.Constants;
import com.farms.models.rest.ResponseDTO;
import com.farms.models.rest.RestMethods;
import com.farms.models.rest.RestResponse;
import com.farms.models.rest.RestServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class ExpenseServiceProvider implements RestServiceProvider {


    private final Logger logger = LoggerFactory.getLogger(ExpenseServiceProvider.class);

    /*
    *  Provides the following services
    *
    *  POST /expense
    *  PUT /expense
    *  DELETE /expense?id=<>
    *  GET /expense?sortBy=<timestamp/address/amount>&sordOrder=<a/d>&offset=<m>&limit=<n>
    *
    * */

    private String path = Constants.__BASE_PATH + "expense";

    public ExpenseServiceProvider(){}

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public Optional<RestResponse> processRestcall(RestMethods method, String body, HttpRequest request) {

        logger.debug("Received method: {}", method);

        switch(method){
            case POST:
            case PUT:
            case DELETE:
            case GET:
            default:
                logger.error("Unsupported Method");
                return Optional.of(new RestResponse()
                        .setResponse(new ResponseDTO().setMessage("Unsupported method"))
                .setStatusCode(StatusCodes.BAD_REQUEST));
        }
    }
}
