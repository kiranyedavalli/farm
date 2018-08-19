/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:32 PM
 * Last Modified 8/17/18 10:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.dashboard;

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

public class DashboardServiceProvider implements RestServiceProvider {

    private final Logger logger = LoggerFactory.getLogger(DashboardServiceProvider.class);

    /*
    *  Provides the following services:
    *
    *  GET /dashboard/summary
    *  GET /dashboard/properties-summary?sortBy=<>&sortOrder=<a/d>&limit=<n>&offset=<m>
    *
    *
    * */

    private final String path = Constants.__BASE_PATH + "dashboard";

    public DashboardServiceProvider(){}

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public Optional<RestResponse> processRestcall(RestMethods method, String body, HttpRequest request) {

        if(!method.equals(RestMethods.GET)){
            logger.error("Unsupported Method: {}", method);
            return Optional.of(new RestResponse()
                    .setResponse(new ResponseDTO().setMessage("Method not supported for this service"))
                    .setStatusCode(StatusCodes.BAD_REQUEST));
        }

        

        return null;
    }
}
