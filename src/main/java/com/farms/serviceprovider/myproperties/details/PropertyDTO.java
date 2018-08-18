/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:21 PM
 * Last Modified 8/17/18 3:39 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.details;

import com.farms.serviceprovider.myproperties.purchase.*;

import java.util.Date;

public class PropertyDTO {

    private String propertyId;
    private String landlordId;
    private PropertyDetails propertyDetails;
    private PurchaseDetails purchaseDetails;
    private LoanTerms loanTerms;
    private LoanCosts loanCosts;
    private GovernmentExpense governmentExpense;
    private Prepaids prepaids;
    private PropertyManagementDetails propertyManagementDetails;
    private Money insurance;
    private Money propertyTaxes;
    private Money assetProtectionCosts;
    private Money monthlyRent;
    private Date recordCreationDate;

    public PropertyDTO() {
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getLandlordId() {
        return landlordId;
    }

    public PropertyDetails getPropertyDetails() {
        return propertyDetails;
    }

    public PurchaseDetails getPurchaseDetails() {
        return purchaseDetails;
    }

    public LoanTerms getLoanTerms() {
        return loanTerms;
    }

    public LoanCosts getLoanCosts() {
        return loanCosts;
    }

    public GovernmentExpense getGovernmentExpense() {
        return governmentExpense;
    }

    public Prepaids getPrepaids() {
        return prepaids;
    }

    public PropertyManagementDetails getPropertyManagementDetails() {
        return propertyManagementDetails;
    }

    public Money getInsurance() {
        return insurance;
    }

    public Money getPropertyTaxes() {
        return propertyTaxes;
    }

    public Money getAssetProtectionCosts() {
        return assetProtectionCosts;
    }

    public Money getMonthlyRent() {
        return monthlyRent;
    }

    public Date getRecordCreationDate() {
        return recordCreationDate;
    }

    public PropertyDTO setPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public PropertyDTO setLandlordId(String landlordId) {
        this.landlordId = landlordId;
        return this;
    }

    public PropertyDTO setPropertyDetails(PropertyDetails propertyDetails) {
        this.propertyDetails = propertyDetails;
        return this;
    }

    public PropertyDTO setPurchaseDetails(PurchaseDetails purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
        return this;
    }

    public PropertyDTO setLoanTerms(LoanTerms loanTerms) {
        this.loanTerms = loanTerms;
        return this;
    }

    public PropertyDTO setLoanCosts(LoanCosts loanCosts) {
        this.loanCosts = loanCosts;
        return this;
    }

    public PropertyDTO setGovernmentExpense(GovernmentExpense governmentExpense) {
        this.governmentExpense = governmentExpense;
        return this;
    }

    public PropertyDTO setPrepaids(Prepaids prepaids) {
        this.prepaids = prepaids;
        return this;
    }

    public PropertyDTO setPropertyManagementDetails(PropertyManagementDetails propertyManagementDetails) {
        this.propertyManagementDetails = propertyManagementDetails;
        return this;
    }

    public PropertyDTO setInsurance(Money insurance) {
        this.insurance = insurance;
        return this;
    }

    public PropertyDTO setPropertyTaxes(Money propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
        return this;
    }

    public PropertyDTO setAssetProtectionCosts(Money assetProtectionCosts) {
        this.assetProtectionCosts = assetProtectionCosts;
        return this;
    }

    public PropertyDTO setMonthlyRent(Money monthlyRent) {
        this.monthlyRent = monthlyRent;
        return this;
    }

    public PropertyDTO setRecordCreationDate(Date recordCreationDate) {
        this.recordCreationDate = recordCreationDate;
        return this;
    }

    public String toString(){
        //TODO: complete this
        return new StringBuilder().append(monthlyRent).toString();
    }
}
