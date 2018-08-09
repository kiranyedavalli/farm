package com.farms.models.purchase;

public class PropertyDetails {

    private Address address;
    private float lotSize;
    private float homeSize;
    private PropertyType propertyType;
    private int yearBuilt;
    private int numUtilities;
    private float zestimate;
    private float rentalZestimate;

    public PropertyDetails() {
    }

    public Address getAddress() {
        return address;
    }

    public float getLotSize() {
        return lotSize;
    }

    public float getHomeSize() {
        return homeSize;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getNumUtilities() {
        return numUtilities;
    }

    public float getZestimate() {
        return zestimate;
    }

    public float getRentalZestimate() {
        return rentalZestimate;
    }

    public PropertyDetails setAddress(Address address) {
        this.address = address;
        return this;
    }

    public PropertyDetails setLotSize(float lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    public PropertyDetails setHomeSize(float homeSize) {
        this.homeSize = homeSize;
        return this;
    }

    public PropertyDetails setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
        return this;
    }

    public PropertyDetails setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
        return this;
    }

    public PropertyDetails setNumUtilities(int numUtilities) {
        this.numUtilities = numUtilities;
        return this;
    }

    public PropertyDetails setZestimate(float zestimate) {
        this.zestimate = zestimate;
        return this;
    }

    public PropertyDetails setRentalZestimate(float rentalZestimate) {
        this.rentalZestimate = rentalZestimate;
        return this;
    }
}
