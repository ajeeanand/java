package com.patterns;

import java.util.Scanner;

public class pattern62 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
