package com.patterns;

public class pattern120 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i == 3)||(j==3)||(i+j)==3) {
                    System.out.print("4");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
