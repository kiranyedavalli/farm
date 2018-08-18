/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:22 PM
 * Last Modified 8/17/18 10:22 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.expenses;

import akka.http.javadsl.model.HttpRequest;
import com.farms.models.common.Constants;
import com.farms.models.rest.RestMethods;
import com.farms.models.rest.RestResponse;
import com.farms.models.rest.RestServiceProvider;

import java.util.Optional;

public class ExpenseServiceProvider implements RestServiceProvider {

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
        return null;
    }
}
