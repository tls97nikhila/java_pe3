package com.stackroute.pe3;


import java.text.SimpleDateFormat;
import java.util.Calendar;

    public class FirstnLastDate {

        public static String getDate() {
            // Get calendar set to current date and time
            Calendar calendar = Calendar.getInstance();

            calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); // set to momday
            String pattern = "EEE dd/MM/yyyy";
            SimpleDateFormat f = new SimpleDateFormat(pattern);
            String firstday = f.format(calendar.getTime());
                calendar.add(Calendar.DATE, 6);

            String lastday = f.format(calendar.getTime());
            System.out.println(firstday + lastday);
            return firstday + lastday;
        }

    }