package com.patterns;

public class pattern105 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 3 || (i == 2 && j == 5)) {
                    System.out.print("P");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

}
