package com.patterns;

import java.util.Scanner;

public class pattern67 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int k = r; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + "*");
            }
            System.out.println();
        }
    }
}
