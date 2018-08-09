/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/8/18 11:59 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

public class ServicesForBorrowers {

    private String titleCompanyName;
    private Address titleCompanyAddress;
    private float titleSearchFee;
    private float commitmentFee;
    private float docPreperationFee;
    private float insuranceClosingLetterFee;
    private float lendersTitleInsuranceFee;
    private float mailAwayFee;
    private float settlementFee;
    private float ownersTitleInsuranceFee;

    public ServicesForBorrowers() {
    }

    public String getTitleCompanyName() {
        return titleCompanyName;
    }

    public Address getTitleCompanyAddress() {
        return titleCompanyAddress;
    }

    public float getTitleSearchFee() {
        return titleSearchFee;
    }

    public float getCommitmentFee() {
        return commitmentFee;
    }

    public float getDocPreperationFee() {
        return docPreperationFee;
    }

    public float getInsuranceClosingLetterFee() {
        return insuranceClosingLetterFee;
    }

    public float getLendersTitleInsuranceFee() {
        return lendersTitleInsuranceFee;
    }

    public float getMailAwayFee() {
        return mailAwayFee;
    }

    public float getSettlementFee() {
        return settlementFee;
    }

    public float getOwnersTitleInsuranceFee() {
        return ownersTitleInsuranceFee;
    }

    public ServicesForBorrowers setTitleCompanyName(String titleCompanyName) {
        this.titleCompanyName = titleCompanyName;
        return this;
    }

    public ServicesForBorrowers setTitleCompanyAddress(Address titleCompanyAddress) {
        this.titleCompanyAddress = titleCompanyAddress;
        return this;
    }

    public ServicesForBorrowers setTitleSearchFee(float titleSearchFee) {
        this.titleSearchFee = titleSearchFee;
        return this;
    }

    public ServicesForBorrowers setCommitmentFee(float commitmentFee) {
        this.commitmentFee = commitmentFee;
        return this;
    }

    public ServicesForBorrowers setDocPreperationFee(float docPreperationFee) {
        this.docPreperationFee = docPreperationFee;
        return this;
    }

    public ServicesForBorrowers setInsuranceClosingLetterFee(float insuranceClosingLetterFee) {
        this.insuranceClosingLetterFee = insuranceClosingLetterFee;
        return this;
    }

    public ServicesForBorrowers setLendersTitleInsuranceFee(float lendersTitleInsuranceFee) {
        this.lendersTitleInsuranceFee = lendersTitleInsuranceFee;
        return this;
    }

    public ServicesForBorrowers setMailAwayFee(float mailAwayFee) {
        this.mailAwayFee = mailAwayFee;
        return this;
    }

    public ServicesForBorrowers setSettlementFee(float settlementFee) {
        this.settlementFee = settlementFee;
        return this;
    }

    public ServicesForBorrowers setOwnersTitleInsuranceFee(float ownersTitleInsuranceFee) {
        this.ownersTitleInsuranceFee = ownersTitleInsuranceFee;
        return this;
    }
}
