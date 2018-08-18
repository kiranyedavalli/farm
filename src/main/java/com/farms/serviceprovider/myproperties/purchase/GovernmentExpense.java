/*
 * Developed  by Kiran Yedavalli on 8/17/18 10:15 PM
 * Last Modified 8/10/18 8:05 PM
 * Copyright (c) 2018. All rights reserved.
 */

package com.farms.serviceprovider.myproperties.purchase;

public class GovernmentExpense {

    public enum GovernmentExpenseType {

        stateDeedTax(true),
        stateMortgageTax(true),
        recordingFees(true);

        private boolean isTaxDeductible;

        GovernmentExpenseType(boolean isTaxDeductible){
            this.isTaxDeductible = isTaxDeductible;
        }

        public boolean isTaxDeductible(){
            return this.isTaxDeductible;
        }
    }

    private GovernmentExpenseType type;




}
