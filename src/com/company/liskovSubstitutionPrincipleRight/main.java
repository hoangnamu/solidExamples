package com.company.liskovSubstitutionPrincipleRight;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // write your code here
        List<EmployeeCalculateSalary> employees = new ArrayList<>();
        //only manager can calculate
        employees.add(new Manager());

        // can not compile
//        employees.add(new PartTimeEmployee());
    }
}
