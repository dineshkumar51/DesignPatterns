package com.designpatterns;

import com.designpatterns.Loan.LoanApproverFacade;

/*
This pattern provides the client a user-friendly, simple interface to use, so that all the inner complexities
(like which methods to invoke and what should be the calling sequence or series of steps to follow) are hidden.
As a result, a client can simply concentrate on the final outcome(s).
 */

public class Main {

    public static void main(String[] args) {
        Applicant applicant = new Applicant("Dinesh", false, 10000, 20000000);
        LoanApproverFacade loanApproverFacade = new LoanApproverFacade();
        loanApproverFacade.canApprove(applicant);
    }
}
