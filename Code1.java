
package com.mycompany.code1;

import java.util.Scanner;

public class Code1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if ((number % 2 == 0 && number % 3 != 0) || (number % 3 == 0 && number % 2 != 0))        
            System.out.println("TRUE");
         else 
            System.out.println("FALSE");        
    }
}
