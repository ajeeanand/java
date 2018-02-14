
package com.patterns;

import java.util.Scanner;

public class pattern9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        for (int j = r; j > 0; j--) {
            for (int i = 69; i >= 65; i--) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
