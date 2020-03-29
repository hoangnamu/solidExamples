package com.company.singleResponsibilityPrinciple;

import com.company.Formatter;

import java.util.Calendar;
import java.util.Date;

public class wrongEmployee {
    private String firstName;
    private String lastName;
    private Date dob;
    // added helper class:
    Formatter formatter;

    // violent single responsibility:
    public String getDobWithFormat() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dob);
        return (calendar.get(Calendar.DAY_OF_MONTH)) + "/"
                + calendar.get(Calendar.MONTH) + "/"
                +calendar.get(Calendar.YEAR);
    }

    public String getEmployee() {
        return firstName + " " + lastName;
    }

    public void checkAttendance() {
        // check attendance logic
    }
}
