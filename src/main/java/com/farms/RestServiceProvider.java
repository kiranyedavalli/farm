/*
 * Developed  by Kiran Yedavalli on 8/9/18 10:57 PM
 * Last Modified 8/9/18 10:57 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms;

import akka.http.javadsl.model.HttpRequest;
import com.farms.models.rest.RestResponse;

import java.util.Optional;

public interface RestServiceProvider {
    String getPath();
    Optional<RestResponse> processRestcall(String method, String body, HttpRequest request);
}
