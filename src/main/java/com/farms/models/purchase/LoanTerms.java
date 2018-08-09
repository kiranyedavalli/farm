package com.farms.models.purchase;

public class LoanTerms {

    private String lender;
    private float loanAmount;
    private float rate;
    private int loanDuration;
    private boolean useEscrow;

    public LoanTerms() {
    }

    public String getLender() {
        return lender;
    }

    public float getLoanAmount() {
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

    public LoanTerms setLoanAmount(float loanAmount) {
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
