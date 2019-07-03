package com.stackroute.pe3;

public class GenerateExceptions {
    public Exception displayException1() {
        Exception exception = null;
        try {
            int[] array = new int[-10]; //negative
        } catch (Exception e) {
            exception=e;
        }
        return exception;
    }

    public Exception displayException2() {
        Exception exception = null;
        try {
            int[] array = new int[2];  //array index out of bounds
            array[4] = 10;
        } catch (Exception e) {
            exception= e;
        }
        return exception;
    }

    public Exception displayException3() {
        Exception exception = null;
        String value = null;
        try {
            if (value.equals("abc")) {
                System.out.print(value); // nul pointer exception
            }

        } catch (Exception e) {
            exception = e;
        }
        return exception;
    }
}

