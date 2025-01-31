package com.designpatterns.Loan;

import com.designpatterns.Applicant;

public class LoanApproverFacade {

    AssetChecker assetChecker = new AssetChecker();
    CurrLoanChecker currLoanChecker = new CurrLoanChecker();

    public boolean canApprove(Applicant applicant) {
        if(assetChecker.canApprove(applicant.getLoanAmount(), applicant.getAssetValue()) && currLoanChecker.canApprove(applicant.isHasAnyCurrLoan())){
            System.out.println("Loan application check success");
            return true;
        }
        System.out.println("Loan application check failed");
        return false;
    }
}
