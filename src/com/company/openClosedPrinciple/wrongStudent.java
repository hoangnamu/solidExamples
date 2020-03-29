package com.company.openClosedPrinciple;

import com.company.Enum.StudentType;

public class wrongStudent {
    private static final int STANDARD_CREDIT_PRICE = 200;
    private static final int CLC_CREDIT_PRICE = 500;
    private static final int APCS_CREDIT_PRICE = 900;

    private int numOfCredit;
    private StudentType studentType;

    public int calculateTuition(){
        if(studentType.equals(StudentType.APCS)){
            return numOfCredit * APCS_CREDIT_PRICE;
        }else if(studentType.equals(StudentType.CLC)){
            return numOfCredit * CLC_CREDIT_PRICE;
        }else{
            return numOfCredit * STANDARD_CREDIT_PRICE;
        }
    }
}
