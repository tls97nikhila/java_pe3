package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks obj;
    @Before
    public void setUp()
    {
        obj=new StudentMarks();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void testgivenArrayShouldReturnNotBetween1to100Grades()
    {
        double array[]= {90,77,108,61,57};
        String result=obj.checkgrade(array);
        assertEquals("Not Between 1 to 100",result);
    }

    @Test
    public void testgivenArrayShouldReturnPassed()
    {
        double array[]= {27,73,66,38,52};
        String result=obj.checkgrade(array);
        assertEquals("Passed",result);
    }
    @Test
    public void testgivenArrayShouldEvaluateDouble()
    {
        double array[]= {27.5,73.4,66.3,38.4,52.3};
        String result=obj.checkgrade(array);
        assertEquals("Passed",result);
    }

}
