
package com.patterns;

public class pattern90 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 10; j++) {
                if ((i == 5 && j == 1) || (i == 5 && j == 10) || (i == 4 && j == 9) || (i == 4 && j == 2) || (i == 3 && j == 3) || (i == 3 && j == 8) || (i == 2 && j == 7) || (i == 2 && j == 4) || (i == 1 && j == 6) || (i == 1 && j == 5) || (i == 3 && j == 4) || (i == 3 && j == 5) || (i == 3 && j == 6) || (i == 3 && j == 7)) {
                    System.out.print("A");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
