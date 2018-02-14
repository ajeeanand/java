package com.patterns;

import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int j = 0; j < r; j++) {
            for (int i = 65; i < 70; i++) {
                System.out.print((char) i);
            }
            System.out.println();

        }
    }
}
