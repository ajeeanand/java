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
public class pattern45 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int value = 1;
        for (int i = 2; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + "*");
                value++;
            }
            value = value - 1;
            System.out.println();
        }
    }
}
