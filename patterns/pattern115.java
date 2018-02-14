package com.patterns;

public class pattern115 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if ((i == 1) || (i == 3 && j == 3) || (i == 2 && j == 4) || (i == 5) || (j == 2 && i == 4)) {
                    System.out.print("Z");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
