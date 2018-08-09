/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/8/18 11:40 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;


public class PurchaseDetails {

    private String date;
    private float listingPrice;
    private float purchasedPrice;
    private float earnestMoney;
    private float downPayment;
    private float costOfInspections;

    public PurchaseDetails() {
    }

    public String getDate() {
        return date;
    }

    public float getListingPrice() {
        return listingPrice;
    }

    public float getPurchasedPrice() {
        return purchasedPrice;
    }

    public float getEarnestMoney() {
        return earnestMoney;
    }

    public float getDownPayment() {
        return downPayment;
    }

    public float getCostOfInspections() {
        return costOfInspections;
    }

    public PurchaseDetails setDate(String date) {
        this.date = date;
        return this;
    }

    public PurchaseDetails setListingPrice(float listingPrice) {
        this.listingPrice = listingPrice;
        return this;
    }

    public PurchaseDetails setPurchasedPrice(float purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
        return this;
    }

    public PurchaseDetails setEarnestMoney(float earnestMoney) {
        this.earnestMoney = earnestMoney;
        return this;
    }

    public PurchaseDetails setDownPayment(float downPayment) {
        this.downPayment = downPayment;
        return this;
    }

    public PurchaseDetails setCostOfInspections(float costOfInspections) {
        this.costOfInspections = costOfInspections;
        return this;
    }
}
