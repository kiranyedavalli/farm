/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/10/18 7:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;


import java.util.Date;

public class PurchaseDetails {

    private Date date;
    private Money listingPrice;
    private Money purchasedPrice;
    private Money earnestMoney;
    private Money downPayment;
    private Money costOfInspections;

    public PurchaseDetails() {
    }

    public Date getDate() {
        return date;
    }

    public Money getListingPrice() {
        return listingPrice;
    }

    public Money getPurchasedPrice() {
        return purchasedPrice;
    }

    public Money getEarnestMoney() {
        return earnestMoney;
    }

    public Money getDownPayment() {
        return downPayment;
    }

    public Money getCostOfInspections() {
        return costOfInspections;
    }

    public PurchaseDetails setDate(Date date) {
        this.date = date;
        return this;
    }

    public PurchaseDetails setListingPrice(Money listingPrice) {
        this.listingPrice = listingPrice;
        return this;
    }

    public PurchaseDetails setPurchasedPrice(Money purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
        return this;
    }

    public PurchaseDetails setEarnestMoney(Money earnestMoney) {
        this.earnestMoney = earnestMoney;
        return this;
    }

    public PurchaseDetails setDownPayment(Money downPayment) {
        this.downPayment = downPayment;
        return this;
    }

    public PurchaseDetails setCostOfInspections(Money costOfInspections) {
        this.costOfInspections = costOfInspections;
        return this;
    }
}
