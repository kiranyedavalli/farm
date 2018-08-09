/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/8/18 11:22 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

public class Prepaids {

    private float homeOwnersInsurance;
    private float mortgageInsurance;
    private float propertyTaxes;

    public Prepaids() {
    }

    public float getHomeOwnersInsurance() {
        return homeOwnersInsurance;
    }

    public float getMortgageInsurance() {
        return mortgageInsurance;
    }

    public float getPropertyTaxes() {
        return propertyTaxes;
    }

    public Prepaids setHomeOwnersInsurance(float homeOwnersInsurance) {
        this.homeOwnersInsurance = homeOwnersInsurance;
        return this;
    }

    public Prepaids setMortgageInsurance(float mortgageInsurance) {
        this.mortgageInsurance = mortgageInsurance;
        return this;
    }

    public Prepaids setPropertyTaxes(float propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
        return this;
    }
}
