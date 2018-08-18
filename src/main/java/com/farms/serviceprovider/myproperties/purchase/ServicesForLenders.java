/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/10/18 7:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;

public class ServicesForLenders {

    private Money appraisalFee;
    private Money floodServicesFee;
    private Money operatingIncomeFee;

    public ServicesForLenders() {
    }

    public Money getAppraisalFee() {
        return appraisalFee;
    }

    public Money getFloodServicesFee() {
        return floodServicesFee;
    }

    public Money getOperatingIncomeFee() {
        return operatingIncomeFee;
    }

    public ServicesForLenders setAppraisalFee(Money appraisalFee) {
        this.appraisalFee = appraisalFee;
        return this;
    }

    public ServicesForLenders setFloodServicesFee(Money floodServicesFee) {
        this.floodServicesFee = floodServicesFee;
        return this;
    }

    public ServicesForLenders setOperatingIncomeFee(Money operatingIncomeFee) {
        this.operatingIncomeFee = operatingIncomeFee;
        return this;
    }
}
