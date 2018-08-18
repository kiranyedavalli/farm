/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/17/18 2:36 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;

import com.farms.models.common.Address;

public class ServicesForBorrowers {

    private String titleCompanyName;
    private Address titleCompanyAddress;
    private Money titleSearchFee;
    private Money commitmentFee;
    private Money docPreperationFee;
    private Money insuranceClosingLetterFee;
    private Money lendersTitleInsuranceFee;
    private Money mailAwayFee;
    private Money settlementFee;
    private Money ownersTitleInsuranceFee;

    public ServicesForBorrowers() {
    }

    public String getTitleCompanyName() {
        return titleCompanyName;
    }

    public Address getTitleCompanyAddress() {
        return titleCompanyAddress;
    }

    public Money getTitleSearchFee() {
        return titleSearchFee;
    }

    public Money getCommitmentFee() {
        return commitmentFee;
    }

    public Money getDocPreperationFee() {
        return docPreperationFee;
    }

    public Money getInsuranceClosingLetterFee() {
        return insuranceClosingLetterFee;
    }

    public Money getLendersTitleInsuranceFee() {
        return lendersTitleInsuranceFee;
    }

    public Money getMailAwayFee() {
        return mailAwayFee;
    }

    public Money getSettlementFee() {
        return settlementFee;
    }

    public Money getOwnersTitleInsuranceFee() {
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

    public ServicesForBorrowers setTitleSearchFee(Money titleSearchFee) {
        this.titleSearchFee = titleSearchFee;
        return this;
    }

    public ServicesForBorrowers setCommitmentFee(Money commitmentFee) {
        this.commitmentFee = commitmentFee;
        return this;
    }

    public ServicesForBorrowers setDocPreperationFee(Money docPreperationFee) {
        this.docPreperationFee = docPreperationFee;
        return this;
    }

    public ServicesForBorrowers setInsuranceClosingLetterFee(Money insuranceClosingLetterFee) {
        this.insuranceClosingLetterFee = insuranceClosingLetterFee;
        return this;
    }

    public ServicesForBorrowers setLendersTitleInsuranceFee(Money lendersTitleInsuranceFee) {
        this.lendersTitleInsuranceFee = lendersTitleInsuranceFee;
        return this;
    }

    public ServicesForBorrowers setMailAwayFee(Money mailAwayFee) {
        this.mailAwayFee = mailAwayFee;
        return this;
    }

    public ServicesForBorrowers setSettlementFee(Money settlementFee) {
        this.settlementFee = settlementFee;
        return this;
    }

    public ServicesForBorrowers setOwnersTitleInsuranceFee(Money ownersTitleInsuranceFee) {
        this.ownersTitleInsuranceFee = ownersTitleInsuranceFee;
        return this;
    }
}
