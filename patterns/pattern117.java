package com.patterns;

public class pattern117 {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 9; i++) {
            for (j = 0; j <= 9; j++) {
                if ((i + j) == 4 || (j == 4) || (i == 9)) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
