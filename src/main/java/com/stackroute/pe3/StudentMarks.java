package com.stackroute.pe3;

public class StudentMarks {
    public String checkgrade(double[] grades) {
        int len = grades.length;
        for (int i = 0; i < len; i++) {
            try {
                if (grades[i] > 100 || grades[i] < 0) {
                    throw new Exception("Not Between 1 to 100"); // out of bounds message
                }

            } catch (Exception exception) {
                return exception.getMessage(); // message
            }
        }
        return "Passed";
    }
}
