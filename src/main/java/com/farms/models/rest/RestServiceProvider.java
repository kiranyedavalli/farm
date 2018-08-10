/*
 * Developed  by Kiran Yedavalli on 8/10/18 7:23 AM
 * Last Modified 8/10/18 7:17 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.rest;

import akka.http.javadsl.model.HttpRequest;
import com.farms.models.rest.RestResponse;

import java.util.Optional;

public interface RestServiceProvider {
    String getPath();
    Optional<RestResponse> processRestcall(String method, String body, HttpRequest request);
}
