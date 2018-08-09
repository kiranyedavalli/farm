/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/8/18 11:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

public class Address {

    private int doorNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address() {
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Address setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
        return this;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address setZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }
}
