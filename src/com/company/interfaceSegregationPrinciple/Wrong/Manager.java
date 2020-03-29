package com.company.interfaceSegregationPrinciple.Wrong;

public class Manager extends Employee implements ManagerSkills {
    public int calculateSalary() {
        return workTime * PART_TIME_SALARY;
    }

    public void training() {
        System.out.println("do nothing");
    }

    public void marketing() {
        System.out.println("do nothing");
    }
}
