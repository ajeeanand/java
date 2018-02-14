
package com.patterns;

public class pattern113 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if ((i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 1 && j == 5) || (i == 2 && j == 4) || (i == 4 && j == 2) || (i == 5 && j == 1)) {
                    System.out.print("X");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

}
