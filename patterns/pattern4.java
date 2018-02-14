package com.patterns;

import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter no of columns");
        int c = s.nextInt();
        for (int i = 65; i < 70; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
