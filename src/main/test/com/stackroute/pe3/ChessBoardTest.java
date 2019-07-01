package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

        ChessBoard obj;
        @Before
        public  void setup() {
            obj= new ChessBoard();

        }

        @After
        public  void teardown() {
            obj= null;

        }

        @Test
        public void testShouldReturnChessBoardStructure() {
            String Expectedresult= "WW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                    "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\n" +
                    "BB|WW|BB|WW|BB|WW|BB|WW|\n";
            String res=Expectedresult.toString();
            String result=obj.displayChess();
            assertEquals(result,res);

        }
    }
