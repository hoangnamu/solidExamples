package com.company.interfaceSegregationPrinciple.Wrong;

import com.company.Formatter;

import java.util.Date;

public class rightEmployee {
    private String firstName;
    private String lastName;
    private Date dob;
    // added helper class:
    Formatter formatter;

    // violent single responsibility:
    public String getDobWithFormat() {
        // let the class formatter do its job
        return formatter.formatDob(this.dob);
    }

    public String getEmployee() {
        // let the class formatter do its job
        return formatter.formatName(firstName, lastName);
    }

    public void checkAttendance() {
        // check attendance logic
    }
}
