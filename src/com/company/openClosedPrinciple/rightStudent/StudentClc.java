package com.company.openClosedPrinciple.rightStudent;

public class StudentClc extends rightStudent {
    private static final int CLC_CREDIT_PRICE = 500;

    public int calculateTuition() {
        return numOfCredit * CLC_CREDIT_PRICE;
    }
}
