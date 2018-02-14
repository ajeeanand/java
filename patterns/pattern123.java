package com.patterns;

public class pattern123 {

    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0) || (i + j == 7)) {
                    System.out.print("7");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
