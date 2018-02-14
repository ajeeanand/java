package com.patterns;

public class pattern22 {

    public static void main(String[] args) {
        int y = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print((char) (69 - i));
            }
            System.out.println();
            y--;
        }
    }
}
