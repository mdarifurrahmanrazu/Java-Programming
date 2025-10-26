
package com.mycompany.problem4;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] words = new String[n];
        
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                int len1 = words[j].length();
                int len2 = words[j + 1].length();
                int minLength = Math.min(len1, len2);
                boolean swapped = false;
                
                for (int k = 0; k < minLength; k++) {
                    char ch1 = words[j].charAt(k);
                    char ch2 = words[j + 1].charAt(k);
                    
                    if (ch1 > ch2) {
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                        swapped = true;
                        break;
                    } else if (ch1 < ch2) {
                        swapped = true;
                        break;
                    }
                }
                
                if (!swapped && len1 > len2) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("In the lexicographical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

