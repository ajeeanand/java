package com.patterns;

public class pattern106 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 6; j++) {
                if ((i == 1 && j == 1) || (i == 1 && j == 2) || (i == 1 && j == 3) || (i == 1 && j == 4) || (i == 4 && j == 1) || (i == 4 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 4) || (j == 1 && i == 2) || (j == 1 && i == 3) || (j == 4 && i == 2) || (j == 4 && i == 3) || (j == 5 && i == 5) || (j == 2 && i == 2) || (j == 3 && i == 3)) {
                    System.out.print("Q");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
