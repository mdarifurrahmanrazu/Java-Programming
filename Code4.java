
package com.mycompany.code6;

import java.util.Scanner;

public class Code6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from USD to BDT: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Your choice: ");
        int choice = input.nextInt();
        if (choice == 0) 
        {
            System.out.print("Enter the amount in USD: ");
            double usdAmount = input.nextDouble();
            double bdtAmount = usdAmount * exchangeRate;
            System.out.println("Total Amount = "+bdtAmount);
        } 
        else if (choice == 1) 
        {
            System.out.print("Enter the amount in BDT: ");
            double bdtAmount = input.nextDouble();
            double usdAmount = bdtAmount / exchangeRate;
            System.out.println("Total Amount = "+usdAmount);
        } 
        else
            System.out.println("Invalid choice.");        }
}
