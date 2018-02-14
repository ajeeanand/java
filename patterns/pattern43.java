package com.patterns;

import java.util.Scanner;

public class pattern43 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int y = 7;
        for (int i = 1; i <= r; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
