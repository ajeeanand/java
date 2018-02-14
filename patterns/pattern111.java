/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns;

public class pattern111 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if ((i == 1 && j == 1) || (i == 1 && j == 5) || (i == 2 && j == 2) || (i == 2 && j == 4) || (i == 3 && j == 3)) {
                    System.out.print("V");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
