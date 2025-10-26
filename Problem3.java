
package com.mycompany.problem3;

public class Problem3 {

    public static void main(String[] args) {

     int[][] hours = {
            {2, 2, 2, 2, 2, 2, 2},
            {3, 2, 4, 2, 2, 3, 3}, 
            {4, 4, 4, 4, 4, 4, 4}, 
            {2, 4, 2, 2, 4, 2, 2}, 
            {7, 7, 7, 7, 7, 7, 7}, 
            {7, 7, 7, 7, 7, 7, 7},
            {3, 3, 3, 3, 3, 3, 3}, 
            {2, 3, 2, 2, 3, 2, 2}  
        };

        int numEmployees = hours.length;
        int[] totalHours = new int[numEmployees];
        int[] employeeIndex = new int[numEmployees];
        
        for (int i = 0; i < numEmployees; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i] = sum;
            employeeIndex[i] = i;
        }
        
        for (int i = 0; i < numEmployees - 1; i++) {
            for (int j = i + 1; j < numEmployees; j++) {
                if (totalHours[i] < totalHours[j]) {
                    int temp = totalHours[i];
                    totalHours[i] = totalHours[j];
                    totalHours[j] = temp;
                    
                    temp = employeeIndex[i];
                    employeeIndex[i] = employeeIndex[j];
                    employeeIndex[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + employeeIndex[i] + ": " + totalHours[i] + " hours");
        }
    }
}
