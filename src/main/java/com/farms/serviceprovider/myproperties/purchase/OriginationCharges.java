/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/10/18 7:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;

public class OriginationCharges {

    private float points;
    private Money processingFee;
    private Money taxServicingFee;

    public OriginationCharges() {
    }

    public float getPoints() {
        return points;
    }

    public Money getProcessingFee() {
        return processingFee;
    }

    public Money getTaxServicingFee() {
        return taxServicingFee;
    }

    public OriginationCharges setPoints(float points) {
        this.points = points;
        return this;
    }

    public OriginationCharges setProcessingFee(Money processingFee) {
        this.processingFee = processingFee;
        return this;
    }

    public OriginationCharges setTaxServicingFee(Money taxServicingFee) {
        this.taxServicingFee = taxServicingFee;
        return this;
    }
}
