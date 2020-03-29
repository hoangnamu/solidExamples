package com.company.dependencyInversionPrinciple.Right;

public class main {

    public static void main(String[] args) {
        // write your code here
        Employee employee = new Employee();
        // set a report type for this employee
        employee.setReportType(new Employee.ReporterMail());
        // just execute report method, dont care which report type
        employee.report();
    }
}
