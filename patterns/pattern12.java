package com.patterns;

import java.util.Scanner;

public class pattern12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int y = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print(j);
            }
            System.out.println();
            y++;
        }
    }
}
