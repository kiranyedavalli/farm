/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:05 PM
 * Last Modified 8/9/18 8:05 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models;

import com.google.gson.GsonBuilder;

public class Utils {

    public static <T> T getObjectFromJsonString(String json, Class<T> klass){
        return new GsonBuilder().create().fromJson(json, klass);
    }

    public static <T> String getJsonStringFromObject(T t){
        return new GsonBuilder().create().toJson(t);
    }
}
