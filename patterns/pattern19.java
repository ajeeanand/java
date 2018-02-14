package com.patterns;

public class pattern19 {

    public static void main(String[] args) {
        int y = 70;
        for (int i = 1; i <= 5; i++) {
            for (int j = 65; j < y; j++) {
                System.out.print((char) j);
            }
            System.out.println();
            y--;
        }
    }
}
