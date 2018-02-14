/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns;

import java.util.Scanner;

public class pattern72 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int i = r; i > 1; i--) {
            for (int k = r; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print((char) (63 + i) + "*");
            }
            System.out.println();
        }
    }
}
