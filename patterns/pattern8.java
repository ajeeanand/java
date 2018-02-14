package com.patterns;

import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter no of columns");
        int c = s.nextInt();
        for (int i = 69; i >= 65; i--) {
            for (int j = c; j > 0; j--) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
