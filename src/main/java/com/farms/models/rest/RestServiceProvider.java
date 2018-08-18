/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:16 PM
 * Last Modified 8/10/18 2:25 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.rest;

import akka.http.javadsl.model.HttpRequest;

import java.util.Optional;

public interface RestServiceProvider {
    String getPath();
    Optional<RestResponse> processRestcall(RestMethods method, String body, HttpRequest request);
}
