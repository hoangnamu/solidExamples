package com.company.interfaceSegregationPrinciple.Right;

public class SeniorManager extends Employee implements ManagerSkills, SeniorManagerSkills {
    public int calculateSalary() {
        return workTime * PART_TIME_SALARY;
    }

    public void training() {
        System.out.println("Training for managers and part time employees");
    }

    public void marketing() {
        System.out.println("Marketing");
    }
}
