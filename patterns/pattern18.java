/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patterns;

/**
 *
 * @author Admin
 */
public class pattern18 {

    public static void main(String[] args) {
        int y = 5;
        for (int i = 65; i <= 69; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print((char) i);
            }
            System.out.println();
            y--;
        }
    }
}
