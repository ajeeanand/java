package com.patterns;

import java.util.Scanner;

public class pattern38 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int y = 1;
        for (int i = 1; i <= r; i++) {
            for (int k = r; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= y; j++) {
                System.out.print((char) (y + 64));
            }
            System.out.println();
            y = y + 2;
        }
    }
}
