package com.designpatterns;

public class Applicant {

    private final String name;
    private final boolean hasAnyCurrLoan;
    private final int loanAmount;
    private final int assetValue;

    public Applicant(String name, boolean hasAnyCurrLoan, int loanAmount, int assetValue) {
        this.name = name;
        this.hasAnyCurrLoan = hasAnyCurrLoan;
        this.loanAmount = loanAmount;
        this.assetValue = assetValue;
    }

    public String getName() {
        return name;
    }

    public boolean isHasAnyCurrLoan() {
        return hasAnyCurrLoan;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public int getAssetValue() {
        return assetValue;
    }
}
