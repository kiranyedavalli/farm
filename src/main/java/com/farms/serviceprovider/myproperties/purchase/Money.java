/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/10/18 7:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;

public class Money {

    private float amount;
    private boolean isTaxDeductible = false;

    public Money(){}

    public float getAmount() {
        return amount;
    }

    public boolean isTaxDeductible() {
        return isTaxDeductible;
    }

    public Money setAmount(float amount) {
        this.amount = amount;
        return this;
    }

    public Money setTaxDeductible(boolean taxDeductible) {
        isTaxDeductible = taxDeductible;
        return this;
    }
}
