/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/10/18 7:32 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;

public class LoanTerms {

    private String lender;
    private Money loanAmount;
    private float rate;
    private int loanDuration;
    private boolean useEscrow;

    public LoanTerms() {
    }

    public String getLender() {
        return lender;
    }

    public Money getLoanAmount() {
        return loanAmount;
    }

    public float getRate() {
        return rate;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public boolean isUseEscrow() {
        return useEscrow;
    }

    public LoanTerms setLender(String lender) {
        this.lender = lender;
        return this;
    }

    public LoanTerms setLoanAmount(Money loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    public LoanTerms setRate(float rate) {
        this.rate = rate;
        return this;
    }

    public LoanTerms setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
        return this;
    }

    public LoanTerms setUseEscrow(boolean useEscrow) {
        this.useEscrow = useEscrow;
        return this;
    }
}
