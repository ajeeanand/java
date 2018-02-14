package com.patterns;

import java.util.Scanner;

public class pattern63 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + r - j;
            }
            System.out.println();
        }
    }
}
