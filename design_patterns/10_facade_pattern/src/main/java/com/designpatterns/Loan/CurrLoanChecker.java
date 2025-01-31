package com.designpatterns.Loan;

class CurrLoanChecker {

    boolean canApprove(boolean hasCurrLoan){
        if(hasCurrLoan) {
            System.out.println("CurrLoan check failed");
            return false;
        }
        System.out.println("CurrLoan check success");
        return true;
    }
}
