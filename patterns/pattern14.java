package com.patterns;

import java.util.Scanner;

public class pattern14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int y = 66;
        for (int i = 1; i <= r; i++) {
            for (int j = 65; j < y; j++) {
                System.out.print((char) j);
            }
            System.out.println();
            y++;
        }
    }
}
