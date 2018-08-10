/*
 * Developed  by Kiran Yedavalli on 8/10/18 2:14 PM
 * Last Modified 8/10/18 6:53 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.infra.rest;

public abstract class BaseDTO {

    private String id;
    private String customerId;

    public BaseDTO(){}

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public BaseDTO setId(String id) {
        this.id = id;
        return this;
    }

    public BaseDTO setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
