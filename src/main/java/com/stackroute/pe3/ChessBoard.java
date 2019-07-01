package com.stackroute.pe3;

public class ChessBoard {

        public  static String displayChess() {
            String string= "";

            for(int i = 0; i < 8; ++i) {
                if (i % 2 == 0) {
                    string = string + "WW|BB|WW|BB|WW|BB|WW|BB|\n";
                } else {
                    string = string + "BB|WW|BB|WW|BB|WW|BB|WW|\n";
                }
            }
            return string;
        }
}
