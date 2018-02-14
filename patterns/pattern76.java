package com.patterns;

public class pattern76 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) {
            for (k = 6; k >= i + 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
