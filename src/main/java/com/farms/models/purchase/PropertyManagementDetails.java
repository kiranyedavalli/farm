/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/8/18 11:49 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

public class PropertyManagementDetails {

    private String name;
    private Address address;
    private float newLeaseRate;
    private float monthlyRate;
    private float utilitiesSetupFee;

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

    public float getUtilitiesSetupFee() {
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

    public PropertyManagementDetails setUtilitiesSetupFee(float utilitiesSetupFee) {
        this.utilitiesSetupFee = utilitiesSetupFee;
        return this;
    }
}
