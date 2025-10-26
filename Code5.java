
package com.mycompany.code7;

import java.util.Scanner;

public class Code7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the center of circle (p q): ");
        double p = input.nextDouble();
        double q = input.nextDouble();
        System.out.print("Enter the radius of circle: ");
        double r = input.nextDouble();
        System.out.print("Enter the point (x y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x - p, 2) + Math.pow(y - q, 2));
        if (distance < r)
            System.out.println("The point is inside the circle."); 
        else if (distance == r)      
            System.out.println("The point is on the circle.");
        else 
            System.out.println("The point is outside the circle.");
        
    }
}
