package com.patterns;

public class pattern99 {

    public static void main(String[] args) {
        int j, i;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || j == 3 || (i == 5 && j == 3) || (i == 5 && j == 2) || (i == 5 && j == 1) || (i == 4 && j == 1) || (i == 3 && j == 1)) {
                    System.out.print("J");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

}
