package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter {
    public String formatDob(Date dob) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }

    public String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
