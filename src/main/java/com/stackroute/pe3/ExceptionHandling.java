package com.stackroute.pe3;

public class ExceptionHandling {


        String msg="";
        public  ExceptionHandling(String msg){

        }
        public String throwexception()
        {
            try {
                Exception e=new Exception();
                throw e;
            }
            catch(Exception e) {
                return msg;
            }
            finally {
                System.out.println("reached finally");;
            }
        }
    }
