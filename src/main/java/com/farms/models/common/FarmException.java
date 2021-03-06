/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:17 PM
 * Last Modified 8/10/18 2:25 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.common;

public class FarmException extends RuntimeException {
    private String message;
    public FarmException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
