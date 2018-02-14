package com.patterns;

public class pattern94 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1 || i == 5) {
                    System.out.print("E");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

}
