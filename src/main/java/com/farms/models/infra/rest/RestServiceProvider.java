/*
 * Developed  by Kiran Yedavalli on 8/10/18 2:14 PM
 * Last Modified 8/10/18 7:36 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.infra.rest;

import akka.http.javadsl.model.HttpRequest;

import java.util.Optional;

public interface RestServiceProvider {
    String getPath();
    Optional<RestResponse> processRestcall(String method, String body, HttpRequest request);
}
