package com.patterns;

import java.util.Scanner;

public class pattern59 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= r; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= r; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
