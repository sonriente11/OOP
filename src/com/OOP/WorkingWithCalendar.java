package com.OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkingWithCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat adf = new SimpleDateFormat("dd/MM/YYYY, EEEEEEEEEEEE");
        System.out.println(adf.format(cal.getTime()));
    //Calendar and SimpleDateFormat are similar
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

    }

}
