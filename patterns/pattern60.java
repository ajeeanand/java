package com.patterns;

import java.util.Scanner;

public class pattern60 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
                for (int j = 1; j <= r; j++) {
                    System.out.print(num);
                    num = (num == 0) ? 1 : 0;
                }
            } else {
                num = 1;
                for (int j = 1; j <= r; j++) {
                    System.out.print(num);
                    num = (num == 0) ? 1 : 0;
                }
            }
            System.out.println();
        }
    }
}
