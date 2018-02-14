package com.patterns;

public class pattern101 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j == 1 || i == 5) {
                    System.out.print("L");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
        System.out.println("");
    }

}
