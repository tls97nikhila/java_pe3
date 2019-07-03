package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

        ChessBoard chessBoard;
        @Before
        public  void setup() {
            chessBoard= new ChessBoard();

        }

        @After
        public  void teardown() {
            chessBoard= null;

        }



    @Test
    public void returnFalse() { //checks whether the result matches the expected output
        int row=2, column = 3;
        boolean check = chessBoard.checkRowColumn(row, column);
        assertFalse(check);
    }

    @Test
    public void returnAnotherChessBoard() {
        int row =4, column = 4;
        boolean check = chessBoard.checkRowColumn(row, column);
        assertTrue(check);
        String[][] result = chessBoard.chessBoard(row, column);
        String[][] expected = {{"WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|"},}; // 4 x 4 chess
        assertArrayEquals(expected,result);
    }

    @Test
    public void returnChessBoard() {
        int row =8, column = 8;
        boolean check = chessBoard.checkRowColumn(row, column); // 8 x 8 chess board
                assertTrue(check);
        String[][] result = chessBoard.chessBoard(row, column);
        String[][] expected = {{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}};
        assertArrayEquals(expected,result);
    }

}
