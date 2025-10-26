
package com.mycompany.problem1;

import java.util.Random;

public class Problem1 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        Random rand = new Random();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(2);  
            }
        }
        
        System.out.println("Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int mRcount = 0;
        int maxRIndex = -1;
        for (int i = 0; i < 4; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > mRcount) {
                mRcount = rowCount;
                maxRIndex = i;
            }
        }
        
        int mCcount = 0;
        int maxCIndex = -1;
        for (int j = 0; j < 4; j++) {
            int colCount = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount > mCcount) {
                mCcount = colCount;
                maxCIndex = j;
            }
        }
        
        System.out.println("The largest row index : "+maxRIndex);
        System.out.println("The largest column index : "+maxCIndex);
    }
}
