package com.patterns;

import java.util.Scanner;

public class pattern47 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        System.out.println("Enter no of columns");
        int c = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
            c = c - 1;

        }

    }
}
