/*
 * Developed  by Kiran Yedavalli on 8/10/18 6:45 AM
 * Last Modified 8/10/18 6:45 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.rest;

public class ResponseDTO extends BaseDTO{
    private String message;
    public ResponseDTO(){}
    public String getMessage(){return this.message;}
    public ResponseDTO setMessage(String message){this.message=message;return this;}
}
