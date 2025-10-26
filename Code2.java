package com.mycompany.code2;

import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int totalDays = minutes / (60 * 24);
        int years = totalDays / 365;
        int days = totalDays % 365;
        System.out.println("Minutes = "+minutes);
        System.out.println("Years = "+years);
        System.out.println("Days = "+days);
    }
}

