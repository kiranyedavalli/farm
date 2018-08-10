/*
 * Developed  by Kiran Yedavalli on 8/9/18 10:57 PM
 * Last Modified 8/9/18 10:57 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms;

import akka.http.javadsl.model.HttpMethod;
import akka.http.javadsl.server.Route;

public interface RestServiceProvider {
    String getPath();
    Route processRestcall(String method, String body);
}
