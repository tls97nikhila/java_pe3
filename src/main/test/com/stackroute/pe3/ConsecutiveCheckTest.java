package com.stackroute.pe3;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    private static ConsecutiveCheck obj;
    @Before
    public void setup() {
        obj= new ConsecutiveCheck();
    }

    @After
    public void teardown() {
        obj = null;

    }
    @Test
    public void checkNonConsecutive() { //checks whether the result matches the expected output

        boolean actual = obj.checkConsecutive("-97,-96,-95,-94,-93,-92");

        assertTrue(actual);
    }

    @Test
    public void checkConsecutiveOne() { //checks whether the result matches the expected output

        boolean actual = obj.checkConsecutive("54,53,52,51,50,49,48");

        assertTrue(actual);
    }

    @Test
    public void checkNonConsecutiveTwo() { //checks whether the result matches the expected output

        boolean actual = obj.checkConsecutive("1,2,3,4,5,6,6");

        assertFalse(actual);
    }

}

