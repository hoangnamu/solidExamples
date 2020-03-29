package com.company.openClosedPrinciple.rightStudent;

public class rightStudent {
    private static final int STANDARD_CREDIT_PRICE = 300;

    protected int numOfCredit;

    public int calculateTuition() {
        return numOfCredit * STANDARD_CREDIT_PRICE;
    }
}
