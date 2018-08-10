/*
 * Developed  by Kiran Yedavalli on 8/10/18 2:08 PM
 * Last Modified 8/10/18 2:08 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.customer;

import com.farms.models.purchase.PropertyDTO;
import com.farms.models.reports.Monthly;
import com.farms.models.reports.Tax;
import com.farms.models.reports.Yearly;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Customer {

    private String customerId;
    private Map<String, PropertyDTO> purchasedProperties = new ConcurrentHashMap<>();
    private Map<String, List<Monthly>> monthlyReports = new ConcurrentHashMap<>();
    private Map<String, List<Yearly>> yearlyReports = new ConcurrentHashMap<>();
    private Map<String, List<Tax>> taxReports = new ConcurrentHashMap<>();

    public Customer(){}

    public void addProperty(PropertyDTO property){
        purchasedProperties.put(property.getId(), property);
    }



}
