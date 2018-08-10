/*
 * Developed  by Kiran Yedavalli on 8/10/18 2:17 PM
 * Last Modified 8/10/18 2:17 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Incidental {

    private Date date;
    private Map<String, Float> details = new HashMap<>();

    public Incidental(){}

    public Date getDate() {
        return date;
    }

    public Map<String, Float> getDetails() {
        return details;
    }

    public Incidental setDate(Date date) {
        this.date = date;
        return this;
    }

    public Incidental setDetail(Map<String, Float> details) {
        this.details = details;
        return this;
    }
}
