
package com.mycompany.problem6;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter score of " + names[i] + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = 0; j < numberOfStudents - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        System.out.println("\nStudents in decreasing order of their scores:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }
}
