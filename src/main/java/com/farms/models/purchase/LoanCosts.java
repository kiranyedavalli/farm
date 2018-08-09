package com.farms.models.purchase;

public class LoanCosts {

    private OriginationCharges originationCharges;
    private ServicesForLenders servicesForLenders;
    private ServicesForBorrowers servicesForBorrowers;

    public LoanCosts() {
    }

    public OriginationCharges getOriginationCharges() {
        return originationCharges;
    }

    public ServicesForLenders getServicesForLenders() {
        return servicesForLenders;
    }

    public ServicesForBorrowers getServicesForBorrowers() {
        return servicesForBorrowers;
    }

    public LoanCosts setOriginationCharges(OriginationCharges originationCharges) {
        this.originationCharges = originationCharges;
        return this;
    }

    public LoanCosts setServicesForLenders(ServicesForLenders servicesForLenders) {
        this.servicesForLenders = servicesForLenders;
        return this;
    }

    public LoanCosts setServicesForBorrowers(ServicesForBorrowers servicesForBorrowers) {
        this.servicesForBorrowers = servicesForBorrowers;
        return this;
    }
}
