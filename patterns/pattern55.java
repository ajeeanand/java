package com.patterns;

import java.util.Scanner;

public class pattern55 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = s.nextInt();
        int i, j, num = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }
}
