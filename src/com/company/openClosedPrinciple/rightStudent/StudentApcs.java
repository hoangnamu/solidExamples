package com.company.openClosedPrinciple.rightStudent;

public class StudentApcs extends rightStudent {
    private static final int APCS_CREDIT_PRICE = 900;

    public int calculateTuition() {
        return numOfCredit * APCS_CREDIT_PRICE;
    }
}
