/*
 * Developed  by Kiran Yedavalli on 8/9/18 7:49 PM
 * Last Modified 8/9/18 7:49 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.exceptions;

public class FarmException extends RuntimeException {
    private String message;
    public FarmException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
