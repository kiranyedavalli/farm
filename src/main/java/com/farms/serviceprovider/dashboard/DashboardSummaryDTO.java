/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:13 PM
 * Last Modified 8/17/18 3:39 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.dashboard;

import com.farms.models.rest.BaseDTO;

public class DashboardSummaryDTO extends BaseDTO{

    private String landlordId;
    private int numProperties;
    private float avgTotalMonthlyRevenue;
    private float avgTotalMonthlyExpenses;
    private float avgTotalMonthlyIncome;
    private float avgMonthlyRor;
    private float avgTotalYearlyRevenue;
    private float avgTotalYearlyExpenses;
    private float avgTotalYearlyIncome;
    private float avgYearlyRor;

    public DashboardSummaryDTO(){}

    public String getLandlordId() {
        return landlordId;
    }

    public int getNumProperties() {
        return numProperties;
    }

    public float getAvgTotalMonthlyRevenue() {
        return avgTotalMonthlyRevenue;
    }

    public float getAvgTotalMonthlyExpenses() {
        return avgTotalMonthlyExpenses;
    }

    public float getAvgTotalMonthlyIncome() {
        return avgTotalMonthlyIncome;
    }

    public float getAvgMonthlyRor() {
        return avgMonthlyRor;
    }

    public float getAvgTotalYearlyRevenue() {
        return avgTotalYearlyRevenue;
    }

    public float getAvgTotalYearlyExpenses() {
        return avgTotalYearlyExpenses;
    }

    public float getAvgTotalYearlyIncome() {
        return avgTotalYearlyIncome;
    }

    public float getAvgYearlyRor() {
        return avgYearlyRor;
    }

    public void setLandlordId(String landlordId) {
        this.landlordId = landlordId;
    }

    public void setNumProperties(int numProperties) {
        this.numProperties = numProperties;
    }

    public void setAvgTotalMonthlyRevenue(float avgTotalMonthlyRevenue) {
        this.avgTotalMonthlyRevenue = avgTotalMonthlyRevenue;
    }

    public void setAvgTotalMonthlyExpenses(float avgTotalMonthlyExpenses) {
        this.avgTotalMonthlyExpenses = avgTotalMonthlyExpenses;
    }

    public void setAvgTotalMonthlyIncome(float avgTotalMonthlyIncome) {
        this.avgTotalMonthlyIncome = avgTotalMonthlyIncome;
    }

    public void setAvgMonthlyRor(float avgMonthlyRor) {
        this.avgMonthlyRor = avgMonthlyRor;
    }

    public void setAvgTotalYearlyRevenue(float avgTotalYearlyRevenue) {
        this.avgTotalYearlyRevenue = avgTotalYearlyRevenue;
    }

    public void setAvgTotalYearlyExpenses(float avgTotalYearlyExpenses) {
        this.avgTotalYearlyExpenses = avgTotalYearlyExpenses;
    }

    public void setAvgTotalYearlyIncome(float avgTotalYearlyIncome) {
        this.avgTotalYearlyIncome = avgTotalYearlyIncome;
    }

    public void setAvgYearlyRor(float avgYearlyRor) {
        this.avgYearlyRor = avgYearlyRor;
    }
}
