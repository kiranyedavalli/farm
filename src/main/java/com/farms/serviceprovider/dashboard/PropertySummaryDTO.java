/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:14 PM
 * Last Modified 8/17/18 3:39 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.dashboard;

import com.farms.models.rest.BaseDTO;

public class PropertySummaryDTO extends BaseDTO {

    private String propertyId;
    private String landlordId;
    private String address;
    private long purchaseDate;
    private float purchasePrice;
    private float totalCashExpenditure;
    private float loanAmount;
    private float loanRate;
    private String lender;
    private float avgMonthlyRevenue;
    private float avgMonthlyExpenses;
    private float avgMonthlyIncome;
    private float avgMonthlyRor;
    private float avgYearlyRevenue;
    private float avgYearlyExpenses;
    private float avgYearlyIncome;
    private float avgYearlyRor;

    public PropertySummaryDTO() {
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

    public long getPurchaseDate() {
        return purchaseDate;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public float getTotalCashExpenditure() {
        return totalCashExpenditure;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public float getLoanRate() {
        return loanRate;
    }

    public String getLender() {
        return lender;
    }

    public float getAvgMonthlyRevenue() {
        return avgMonthlyRevenue;
    }

    public float getAvgMonthlyExpenses() {
        return avgMonthlyExpenses;
    }

    public float getAvgMonthlyIncome() {
        return avgMonthlyIncome;
    }

    public float getAvgMonthlyRor() {
        return avgMonthlyRor;
    }

    public float getAvgYearlyRevenue() {
        return avgYearlyRevenue;
    }

    public float getAvgYearlyExpenses() {
        return avgYearlyExpenses;
    }

    public float getAvgYearlyIncome() {
        return avgYearlyIncome;
    }

    public float getAvgYearlyRor() {
        return avgYearlyRor;
    }

    public PropertySummaryDTO setPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public PropertySummaryDTO setLandlordId(String landlordId) {
        this.landlordId = landlordId;
        return this;
    }

    public PropertySummaryDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public PropertySummaryDTO setPurchaseDate(long purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    public PropertySummaryDTO setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public PropertySummaryDTO setTotalCashExpenditure(float totalCashExpenditure) {
        this.totalCashExpenditure = totalCashExpenditure;
        return this;
    }

    public PropertySummaryDTO setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    public PropertySummaryDTO setLoanRate(float loanRate) {
        this.loanRate = loanRate;
        return this;
    }

    public PropertySummaryDTO setLender(String lender) {
        this.lender = lender;
        return this;
    }

    public PropertySummaryDTO setAvgMonthlyRevenue(float avgMonthlyRevenue) {
        this.avgMonthlyRevenue = avgMonthlyRevenue;
        return this;
    }

    public PropertySummaryDTO setAvgMonthlyExpenses(float avgMonthlyExpenses) {
        this.avgMonthlyExpenses = avgMonthlyExpenses;
        return this;
    }

    public PropertySummaryDTO setAvgMonthlyIncome(float avgMonthlyIncome) {
        this.avgMonthlyIncome = avgMonthlyIncome;
        return this;
    }

    public PropertySummaryDTO setAvgMonthlyRor(float avgMonthlyRor) {
        this.avgMonthlyRor = avgMonthlyRor;
        return this;
    }

    public PropertySummaryDTO setAvgYearlyRevenue(float avgYearlyRevenue) {
        this.avgYearlyRevenue = avgYearlyRevenue;
        return this;
    }

    public PropertySummaryDTO setAvgYearlyExpenses(float avgYearlyExpenses) {
        this.avgYearlyExpenses = avgYearlyExpenses;
        return this;
    }

    public PropertySummaryDTO setAvgYearlyIncome(float avgYearlyIncome) {
        this.avgYearlyIncome = avgYearlyIncome;
        return this;
    }

    public PropertySummaryDTO setAvgYearlyRor(float avgYearlyRor) {
        this.avgYearlyRor = avgYearlyRor;
        return this;
    }
}
