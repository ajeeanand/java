package com.patterns;

public class pattern53 {

    public static void main(String[] args) {
        int y = 7;
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= y; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
            y = y - 2;
        }
    }
}
