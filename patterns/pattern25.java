package com.patterns;

import java.util.Scanner;

public class pattern25 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int y = 1;
        for (int i = 1; i < r; i++) {
            for (int k = r; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
            y++;
        }
    }
}
