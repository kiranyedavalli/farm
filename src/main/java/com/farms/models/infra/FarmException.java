/*
 * Developed  by Kiran Yedavalli on 8/10/18 2:14 PM
 * Last Modified 8/9/18 8:06 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.infra;

public class FarmException extends RuntimeException {
    private String message;
    public FarmException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
