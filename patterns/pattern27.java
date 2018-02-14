
package com.patterns;

import java.util.Scanner;

public class pattern27 {
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        System.out.println("Enter no of columns");
        int c = s.nextInt();
        for (int i = 0; i < r; i++) {
            for (int k = c; k > i+1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+1; j++) {
                System.out.print((char)(i+65));
            }
            System.out.println();
        }
    } 
}
