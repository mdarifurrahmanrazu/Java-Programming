
package com.mycompany.problem5;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] array = {
            {39, 27, 11, 42},
            {10, 93, 91, 90},
            {54, 78, 56, 89},
            {24, 64, 20, 65}
        };

        System.out.println("Original Array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter the column number to sort by (0-3): ");
        int column = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (array[j][column] > array[j + 1][column]) {
                    for (int k = 0; k < 4; k++) {
                        int temp = array[j][k];
                        array[j][k] = array[j + 1][k];
                        array[j + 1][k] = temp;
                    }
                }
            }
        }

        System.out.println("\nSorted Array (by column " + column + "):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

      
    }
}
