/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:38 PM
 * Last Modified 8/17/18 10:35 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.details;

import com.farms.models.common.Address;
import com.farms.serviceprovider.myproperties.purchase.Money;

public class PropertyManagementDetails {

    private String name;
    private Address address;
    private float newLeaseRate;
    private float monthlyRate;
    private Money utilitiesSetupFee;

    public PropertyManagementDetails() {
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public float getNewLeaseRate() {
        return newLeaseRate;
    }

    public float getMonthlyRate() {
        return monthlyRate;
    }

    public Money getUtilitiesSetupFee() {
        return utilitiesSetupFee;
    }

    public PropertyManagementDetails setName(String name) {
        this.name = name;
        return this;
    }

    public PropertyManagementDetails setAddress(Address address) {
        this.address = address;
        return this;
    }

    public PropertyManagementDetails setNewLeaseRate(float newLeaseRate) {
        this.newLeaseRate = newLeaseRate;
        return this;
    }

    public PropertyManagementDetails setMonthlyRate(float monthlyRate) {
        this.monthlyRate = monthlyRate;
        return this;
    }

    public PropertyManagementDetails setUtilitiesSetupFee(Money utilitiesSetupFee) {
        this.utilitiesSetupFee = utilitiesSetupFee;
        return this;
    }
}
