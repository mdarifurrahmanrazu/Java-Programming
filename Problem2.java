
package com.mycompany.problem22;

import java.util.Scanner;

public class Problem22 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        
        if (password.length() < 8) {
            System.out.println("Invalid Password");
            input.close();
            
        }
        
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
                System.out.println("Invalid Password");
                input.close();
                return;
            }
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }
        
        if (digitCount >= 2) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}