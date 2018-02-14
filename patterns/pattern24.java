/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class pattern24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int y = 5;
        for (int i = r; i >= 1; i--) {
            for (int k = 5; k > y; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
            y++;
        }
    }
}
