package com.patterns;

import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        System.out.println("Enter no of columns");
        int c = s.nextInt();
        System.out.println("");
        for (int i = r; i > 0; i--) {
            for (int j = c; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
