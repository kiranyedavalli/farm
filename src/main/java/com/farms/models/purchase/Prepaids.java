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
