package com.patterns;

public class pattern118 {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 7; i++) {
            for (j = 0; j <= 7; j++) {
                if (((i == 0) && (j <= 2)) || ((i == 1) && (j == 0)) || (((i == 0) && (j == 3)) || ((i == 0) && (j == 4)) || ((i == 0) && (j == 5))) || (i + j == 6) || (i == 6)) {
                    System.out.print("2");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
