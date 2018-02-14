package com.patterns;

import java.util.Scanner;

public class pattern54 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = s.nextInt();
        int i, j, k = 2 * n - 2;
        for (i = 0; i < n; i++) {
            for (j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 2;
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
