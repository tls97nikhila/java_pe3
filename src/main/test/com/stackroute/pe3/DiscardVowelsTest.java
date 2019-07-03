package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class DiscardVowelsTest {

        DiscardVowels obj;
        @Before
        public void setUp()
        {
            obj=new DiscardVowels();
        }
        @After
        public void tearDown()
        {
            obj=null;
        }
        @Test
        public void testShouldReturnWordsWithoutVowels()
        {

            String result=obj.remove("stack");
            assertEquals("stck",result);   // positive test case

        }
        @Test(expected = NullPointerException.class)
        public void testgivenNullShouldReturnNull()  // null pointer exception
        {

            String result=obj.remove(null);


        }
        @Test
        public void testgivenStringWithoutVowelShouldReturnSameString()
        {
            String result=obj.remove("rhythm");
            assertEquals("rhythm",result); // test case without any vowels in it

        }


    }

