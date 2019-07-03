package com.stackroute.pe3;



public class MatrixAddition{
        public int[][] addmatrix(int m,int n,int a[][],int b[][]) // pass 2 matrices as 2D arrays
        {
            int c[][]=new int[m][n];
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < n; k++)
                    {
                        c[i][j] = a[i][j] + b[i][j];  // addition operation
                    }
                }
            }
            return c; // return sum 2D array
        }
    }