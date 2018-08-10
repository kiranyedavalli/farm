/*
 * Developed  by Kiran Yedavalli on 8/10/18 2:58 PM
 * Last Modified 8/10/18 2:58 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.reports;

import java.time.Year;

public class BaseReport {

    private String id;
    private Year year;

    public BaseReport(){}

    public String getId() {
        return id;
    }

    public Year getYear() {
        return year;
    }

    public BaseReport setId(String id) {
        this.id = id;
        return this;
    }

    public BaseReport setYear(Year year) {
        this.year = year;
        return this;
    }
}
