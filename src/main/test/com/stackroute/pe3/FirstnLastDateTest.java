package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstnLastDateTest {


        FirstnLastDate obj;
        @Before
        public void setUp()
        {
            obj=new FirstnLastDate();
        }
        @After
        public void tearDown()
        {
            obj=null;
        }
        @Test
        public void testShouldReturnFirstAndLastDay()
        {

            String result=obj.getDate();
            assertEquals("Mon 01/07/2019Sun 07/07/2019",result);

        }

    }
    