package com.company.dependencyInversionPrinciple.Right;

import java.util.Date;

public class Employee {
    protected static final int PART_TIME_SALARY = 20;
    private String firstName;
    private String lastName;
    private Date dob;
    protected int workTime;
    //add report type :
    ReportType reportType;

    public void setReportType(ReportType reportType) {
        // decide which type of report on this object
        this.reportType = reportType;
    }

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

    public void report() {
        this.reportType.sendReport();
    }

    interface ReportType {
        void sendReport();
    }

    public static class ReporterMail implements ReportType {
        @Override
        public void sendReport() {
            // send via email:
        }
    }

    public static class ReportSlack implements ReportType {
        @Override
        public void sendReport() {
            // send via slack
        }
    }
}




