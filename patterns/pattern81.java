package com.patterns;

import java.util.Scanner;

public class pattern81 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
