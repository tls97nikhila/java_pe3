package com.stackroute.pe3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionsTest {

        GenerateExceptions obj;
        @Before
        public void setup() {
            obj= new GenerateExceptions();
        }

        @After
        public void teardown() {
            obj= null;
        }

        @Test
        public void testNegativeArraySizeException() {
            obj.displayException1();
        }
        @Test
        public void testIndexOutOfBoundException() {
            obj.displayException2();
        }
        @Test
        public void testNullPointerException() {
            obj.displayException3();
        }

    }