package com.farms.models.purchase;

public class PurchaseInfo {

    private String id;
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

    public PurchaseInfo() {
    }

    public String getId() {
        return id;
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

    public PurchaseInfo setId(String id) {
        this.id = id;
        return this;
    }

    public PurchaseInfo setPropertyDetails(PropertyDetails propertyDetails) {
        this.propertyDetails = propertyDetails;
        return this;
    }

    public PurchaseInfo setPurchaseDetails(PurchaseDetails purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
        return this;
    }

    public PurchaseInfo setLoanTerms(LoanTerms loanTerms) {
        this.loanTerms = loanTerms;
        return this;
    }

    public PurchaseInfo setLoanCosts(LoanCosts loanCosts) {
        this.loanCosts = loanCosts;
        return this;
    }

    public PurchaseInfo setGovernmentCosts(GovernmentCosts governmentCosts) {
        this.governmentCosts = governmentCosts;
        return this;
    }

    public PurchaseInfo setPrepaids(Prepaids prepaids) {
        this.prepaids = prepaids;
        return this;
    }

    public PurchaseInfo setPropertyManagementDetails(PropertyManagementDetails propertyManagementDetails) {
        this.propertyManagementDetails = propertyManagementDetails;
        return this;
    }

    public PurchaseInfo setInsurance(float insurance) {
        this.insurance = insurance;
        return this;
    }

    public PurchaseInfo setPropertyTaxes(float propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
        return this;
    }

    public PurchaseInfo setAssetProtectionCosts(float assetProtectionCosts) {
        this.assetProtectionCosts = assetProtectionCosts;
        return this;
    }

    public PurchaseInfo setPurchaseRepairsCosts(float purchaseRepairsCosts) {
        this.purchaseRepairsCosts = purchaseRepairsCosts;
        return this;
    }

    public PurchaseInfo setPurchaseAdditionsCosts(float purchaseAdditionsCosts) {
        this.purchaseAdditionsCosts = purchaseAdditionsCosts;
        return this;
    }

    public PurchaseInfo setMonthlyRent(float monthlyRent) {
        this.monthlyRent = monthlyRent;
        return this;
    }
}
