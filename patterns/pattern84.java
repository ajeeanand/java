
package com.patterns;

import java.util.Scanner;

public class pattern84 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
    
        for (int i = 1; i <= r; i++) {
            for (int j = 0; j <= r+2; j++) {
                if(((i+j)==r-1)||(i+(3)==j)){
                    System.out.print((char)(64+i));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
