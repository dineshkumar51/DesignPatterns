package com.designpatterns.Loan;

class AssetChecker {

    boolean canApprove(int loanAmount, int assetValue){
        if(loanAmount/(assetValue + 0.0f) > 0.25f) {
            System.out.println("Asset check failed");
            return false;

        }
        System.out.println("Asset check success");
        return true;
    }
}
