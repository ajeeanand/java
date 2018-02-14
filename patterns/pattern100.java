package com.patterns;

public class pattern100 {

    public static void main(String[] args) {
        int j, i;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if ((i == 3 && j == 2) || (i == 2 && j == 3) || (i == 1 && j == 4) || (i == 5 && j == 4) || (j == 1) || (i == 4 && j == 3)) {
                    System.out.print("K");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
