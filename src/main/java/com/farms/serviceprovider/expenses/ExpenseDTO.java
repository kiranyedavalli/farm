/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:14 PM
 * Last Modified 8/17/18 3:39 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.expenses;


public class ExpenseDTO {

    private String expenseId;
    private String propertyId;
    private String landlordId;
    private String address;
    private double timestamp;
    private String description;
    private float amount;
    private boolean isTaxdeductible = false;

    public ExpenseDTO(){}

    public String getExpenseId() {
        return expenseId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getLandlordId() {
        return landlordId;
    }

    public String getAddress() {
        return address;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public float getAmount() {
        return amount;
    }

    public boolean isTaxdeductible() {
        return isTaxdeductible;
    }

    public ExpenseDTO setExpenseId(String expenseId) {
        this.expenseId = expenseId;
        return this;
    }

    public ExpenseDTO setPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public ExpenseDTO setLandlordId(String landlordId) {
        this.landlordId = landlordId;
        return this;
    }

    public ExpenseDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public ExpenseDTO setTimestamp(double timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ExpenseDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public ExpenseDTO setAmount(float amount) {
        this.amount = amount;
        return this;
    }

    public ExpenseDTO setTaxdeductible(boolean taxdeductible) {
        isTaxdeductible = taxdeductible;
        return this;
    }
}
