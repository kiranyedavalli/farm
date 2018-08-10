/*
 * Developed  by Kiran Yedavalli on 8/10/18 6:20 AM
 * Last Modified 8/10/18 6:20 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.rest;

import akka.http.javadsl.model.StatusCode;

public class RestResponse {

    private BaseDTO response;
    private StatusCode statusCode;

    public RestResponse(BaseDTO response, StatusCode code){
        this.response = response;
        this.statusCode = code;
    }

    public BaseDTO getResponse() {
        return response;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }
}
