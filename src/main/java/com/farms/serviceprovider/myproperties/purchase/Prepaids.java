/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/10/18 7:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;

public class Prepaids {

    private Money homeOwnersInsurance;
    private Money mortgageInsurance;
    private Money propertyTaxes;

    public Prepaids() {
    }

    public Money getHomeOwnersInsurance() {
        return homeOwnersInsurance;
    }

    public Money getMortgageInsurance() {
        return mortgageInsurance;
    }

    public Money getPropertyTaxes() {
        return propertyTaxes;
    }

    public Prepaids setHomeOwnersInsurance(Money homeOwnersInsurance) {
        this.homeOwnersInsurance = homeOwnersInsurance;
        return this;
    }

    public Prepaids setMortgageInsurance(Money mortgageInsurance) {
        this.mortgageInsurance = mortgageInsurance;
        return this;
    }

    public Prepaids setPropertyTaxes(Money propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
        return this;
    }
}
