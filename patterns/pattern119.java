package com.patterns;

public class pattern119 {
public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i == 0)&& (j < 4)) || ((i == 2)) || ((i == 1) && (j == n-1))|| ((i == 3) && (j == 4)) || ((i == 4) && (j < 4))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
    }

}
