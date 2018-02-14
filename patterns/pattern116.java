
package com.patterns;

public class pattern116 {
     public static void main(String[] args) {
        int number = 7;
 
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 6) {
                for (int j = 0; j < number; j++) {
                    System.out.print("0");
                }
                System.out.println();
            }
            if (i >= 1 && i <= 5) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == 6) {
                        System.out.print("0");
                    } else if (j >= 1 && j <= 5) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
