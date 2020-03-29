package com.company.dependencyInversionPrinciple.Wrong;

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

    public void sendReport() {
        // have to decide which type of report need to use
        //use email:
        ReporterMail reporterMail = new ReporterMail();
        // OR
        ReportSlack reportSlack = new ReportSlack();
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




