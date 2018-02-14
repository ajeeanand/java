package com.patterns;

public class pattern112 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                if ((i == 1 && j == 1) || (i == 1 && j == 5) || (i == 2 && j == 2) || (i == 2 && j == 4) || (i == 3 && j == 3) || (i == 1 && j == 10) || (i == 2 && j == 6) || (i == 2 && j == 8) || (i == 3 && j == 8)) {
                    System.out.print("W");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
