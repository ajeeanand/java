package com.patterns;

import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        System.out.println("Enter no of columns");
        int c = s.nextInt();
        System.out.println("");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
