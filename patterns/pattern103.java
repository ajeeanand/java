package com.patterns;

public class pattern103 {

    public static void main(String[] args) {
        int j, i;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 4)) {
                    System.out.print("N");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
