package com.farms.models.purchase;

public class OriginationCharges {

    private float points;
    private float processingFee;
    private float taxServicingFee;

    public OriginationCharges() {
    }

    public float getPoints() {
        return points;
    }

    public float getProcessingFee() {
        return processingFee;
    }

    public float getTaxServicingFee() {
        return taxServicingFee;
    }

    public OriginationCharges setPoints(float points) {
        this.points = points;
        return this;
    }

    public OriginationCharges setProcessingFee(float processingFee) {
        this.processingFee = processingFee;
        return this;
    }

    public OriginationCharges setTaxServicingFee(float taxServicingFee) {
        this.taxServicingFee = taxServicingFee;
        return this;
    }
}
