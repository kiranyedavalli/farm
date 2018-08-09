package com.farms.models.purchase;

public class ServicesForLenders {

    private float appraisalFee;
    private float floodServicesFee;
    private float operatingIncomeFee;

    public ServicesForLenders() {
    }

    public float getAppraisalFee() {
        return appraisalFee;
    }

    public float getFloodServicesFee() {
        return floodServicesFee;
    }

    public float getOperatingIncomeFee() {
        return operatingIncomeFee;
    }

    public ServicesForLenders setAppraisalFee(float appraisalFee) {
        this.appraisalFee = appraisalFee;
        return this;
    }

    public ServicesForLenders setFloodServicesFee(float floodServicesFee) {
        this.floodServicesFee = floodServicesFee;
        return this;
    }

    public ServicesForLenders setOperatingIncomeFee(float operatingIncomeFee) {
        this.operatingIncomeFee = operatingIncomeFee;
        return this;
    }
}
