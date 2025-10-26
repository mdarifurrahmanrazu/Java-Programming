
package com.mycompany.code3;

import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();        
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();       
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();
        double discriminant = b*b - 4*a*c;
        if (discriminant > 0) 
        {    
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(r1);
            System.out.println(r2);
        } 
        else if (discriminant == 0) 
        {
            double r = -b / (2 * a);
            System.out.println(r);
        } 
        else 
            System.out.println("The equation has no real roots.");    }
}
