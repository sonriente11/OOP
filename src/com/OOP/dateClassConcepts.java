package com.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateClassConcepts {
    public static void main(String[] args) {
        //current date and current time
        Date d = new Date();
        System.out.println(d.toString());

        //if we want to customize the date format as mm//dd//yyyy HH:MM:SS we need class SimpleDateFormat

        SimpleDateFormat adf = new SimpleDateFormat("dd/MM/YYYY, EEEEEEE");
        //M - month
        // Y - year
        // d - day in month
        // H - hour in day (0 -> 23)
        // m - minutes, s - seconds
        // E - day in week
        System.out.println(adf.format(d));
    }
}
