package com.patterns;

import java.util.Scanner;

public class pattern15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        System.out.println("Enter no of columns");
        int y = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print("*");
            }
            System.out.println();
            y--;
        }
    }
}
