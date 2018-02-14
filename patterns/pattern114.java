package com.patterns;

public class pattern114 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 5; j++) {
                if ((i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 2) || (i == 5 && j == 1) || (i == 1 && j == 5) || (i == 2 && j == 4)) {
                    System.out.print("Y");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
