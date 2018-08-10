/*
 * Developed  by Kiran Yedavalli on 8/9/18 8:20 AM
 * Last Modified 8/9/18 12:14 AM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.models.purchase;

import com.farms.models.infra.rest.BaseDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PropertyDTO extends BaseDTO {


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
    private List<Incidental> repairs = new ArrayList<>();
    private List<Incidental> additions = new ArrayList<>();
    private Date addDate;


    public PropertyDTO() {
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

    public List<Incidental> getRepairs() {
        return repairs;
    }

    public List<Incidental> getAdditions() {
        return additions;
    }

    public Date getAddDate() {
        return addDate;
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

    public PropertyDTO setGovernmentCosts(GovernmentCosts governmentCosts) {
        this.governmentCosts = governmentCosts;
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

    public PropertyDTO setInsurance(float insurance) {
        this.insurance = insurance;
        return this;
    }

    public PropertyDTO setPropertyTaxes(float propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
        return this;
    }

    public PropertyDTO setAssetProtectionCosts(float assetProtectionCosts) {
        this.assetProtectionCosts = assetProtectionCosts;
        return this;
    }

    public PropertyDTO setPurchaseRepairsCosts(float purchaseRepairsCosts) {
        this.purchaseRepairsCosts = purchaseRepairsCosts;
        return this;
    }

    public PropertyDTO setPurchaseAdditionsCosts(float purchaseAdditionsCosts) {
        this.purchaseAdditionsCosts = purchaseAdditionsCosts;
        return this;
    }

    public PropertyDTO setMonthlyRent(float monthlyRent) {
        this.monthlyRent = monthlyRent;
        return this;
    }

    public PropertyDTO setRepairs(List<Incidental> repairs) {
        this.repairs = repairs;
        return this;
    }

    public PropertyDTO setAdditions(List<Incidental> additions) {
        this.additions = additions;
        return this;
    }

    public PropertyDTO setAddDate(Date addDate) {
        this.addDate = addDate;
        return this;
    }

    public String toString(){
        //TODO: complete this
        return new StringBuilder().append(monthlyRent).toString();
    }
}
