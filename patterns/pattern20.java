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
public class pattern20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        System.out.println("Enter no of columns");
        int c = s.nextInt();
        int y = 1;
        for (int i = r; i >= 1; i--) {
            for (int j = c; j >= y; j--) {
                System.out.print(i);
            }
            System.out.println();
            y++;
        }
    }
}
