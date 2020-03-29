package com.company.interfaceSegregationPrinciple.Right;

public class Manager extends Employee implements ManagerSkills {
    public int calculateSalary() {
        return workTime * PART_TIME_SALARY;
    }
}
