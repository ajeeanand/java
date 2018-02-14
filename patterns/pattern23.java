package com.patterns;

public class pattern23 {

    public static void main(String[] args) {
        int y = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print((char) (69 - j));
            }
            System.out.println();
            y--;
        }
    }
}
