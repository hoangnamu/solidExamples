package com.company.liskovSubstitutionPrincipleWrong;

import java.util.Date;

public class Employee {
    protected static final int PART_TIME_SALARY = 20;
    private String firstName;
    private String lastName;
    private Date dob;
    protected int workTime;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int calculateSalary(){
        return workTime * PART_TIME_SALARY;
    }
}
