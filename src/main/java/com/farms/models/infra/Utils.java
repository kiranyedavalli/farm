/*
 * Developed  by Kiran Yedavalli on 8/10/18 2:14 PM
 * Last Modified 8/10/18 6:53 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.infra;

import com.google.gson.GsonBuilder;

public class Utils {

    public static <T> T getObjectFromJsonString(String json, Class<T> klass){
        return new GsonBuilder().create().fromJson(json, klass);
    }

    public static <T> String getJsonStringFromObject(T t){
        return new GsonBuilder().create().toJson(t);
    }
}
