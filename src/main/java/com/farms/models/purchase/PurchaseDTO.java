/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/9/18 12:14 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

import com.farms.models.rest.BaseDTO;

public class PurchaseDTO extends BaseDTO {


    private PropertyDetails propertyDetails;
    private PurchaseDetails purchaseDetails;
    private LoanTerms loanTerms;
    private LoanCosts loanCosts;
    private GovernmentCosts governmentCosts;
    private Prepaids prepaids;
    private PropertyManagementDetails propertyManagementDetails;
    private float insurance;
    private float propertyTaxes;
    private float assetProtectionCosts;
    private float purchaseRepairsCosts;
    private float purchaseAdditionsCosts;
    private float monthlyRent;

    public PurchaseDTO() {
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

    public GovernmentCosts getGovernmentCosts() {
        return governmentCosts;
    }

    public Prepaids getPrepaids() {
        return prepaids;
    }

    public PropertyManagementDetails getPropertyManagementDetails() {
        return propertyManagementDetails;
    }

    public float getInsurance() {
        return insurance;
    }

    public float getPropertyTaxes() {
        return propertyTaxes;
    }

    public float getAssetProtectionCosts() {
        return assetProtectionCosts;
    }

    public float getPurchaseRepairsCosts() {
        return purchaseRepairsCosts;
    }

    public float getPurchaseAdditionsCosts() {
        return purchaseAdditionsCosts;
    }

    public float getMonthlyRent() {
        return monthlyRent;
    }

    public PurchaseDTO setPropertyDetails(PropertyDetails propertyDetails) {
        this.propertyDetails = propertyDetails;
        return this;
    }

    public PurchaseDTO setPurchaseDetails(PurchaseDetails purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
        return this;
    }

    public PurchaseDTO setLoanTerms(LoanTerms loanTerms) {
        this.loanTerms = loanTerms;
        return this;
    }

    public PurchaseDTO setLoanCosts(LoanCosts loanCosts) {
        this.loanCosts = loanCosts;
        return this;
    }

    public PurchaseDTO setGovernmentCosts(GovernmentCosts governmentCosts) {
        this.governmentCosts = governmentCosts;
        return this;
    }

    public PurchaseDTO setPrepaids(Prepaids prepaids) {
        this.prepaids = prepaids;
        return this;
    }

    public PurchaseDTO setPropertyManagementDetails(PropertyManagementDetails propertyManagementDetails) {
        this.propertyManagementDetails = propertyManagementDetails;
        return this;
    }

    public PurchaseDTO setInsurance(float insurance) {
        this.insurance = insurance;
        return this;
    }

    public PurchaseDTO setPropertyTaxes(float propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
        return this;
    }

    public PurchaseDTO setAssetProtectionCosts(float assetProtectionCosts) {
        this.assetProtectionCosts = assetProtectionCosts;
        return this;
    }

    public PurchaseDTO setPurchaseRepairsCosts(float purchaseRepairsCosts) {
        this.purchaseRepairsCosts = purchaseRepairsCosts;
        return this;
    }

    public PurchaseDTO setPurchaseAdditionsCosts(float purchaseAdditionsCosts) {
        this.purchaseAdditionsCosts = purchaseAdditionsCosts;
        return this;
    }

    public PurchaseDTO setMonthlyRent(float monthlyRent) {
        this.monthlyRent = monthlyRent;
        return this;
    }

    public String toString(){
        //TODO: complete this
        return new StringBuilder().append(monthlyRent).toString();
    }
}
