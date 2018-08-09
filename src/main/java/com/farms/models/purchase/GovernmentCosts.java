/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/8/18 11:17 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

public class GovernmentCosts {

    private float recordingFees;
    private float stateDeedTax;
    private float stateMortgageTax;

    public GovernmentCosts() {
    }

    public float getRecordingFees() {
        return recordingFees;
    }

    public float getStateDeedTax() {
        return stateDeedTax;
    }

    public float getStateMortgageTax() {
        return stateMortgageTax;
    }

    public GovernmentCosts setRecordingFees(float recordingFees) {
        this.recordingFees = recordingFees;
        return this;
    }

    public GovernmentCosts setStateDeedTax(float stateDeedTax) {
        this.stateDeedTax = stateDeedTax;
        return this;
    }

    public GovernmentCosts setStateMortgageTax(float stateMortgageTax) {
        this.stateMortgageTax = stateMortgageTax;
        return this;
    }
}
