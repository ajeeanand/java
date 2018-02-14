
package com.patterns;

import java.util.Scanner;

public class pattern29 {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
        int i,j,k;
    
        for (i = 1; i <= r; i++) {
            for ( k = r; k >=i; k--) {
                System.out.print(" ");
            }
            for ( j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
     }  
     
     for (i = 1; i <r; i++) {
            for (k = 1; k <=i+1; k++) {
                System.out.print(" ");
            }
            for (j = r; j >i ; j--) {
                System.out.print(j-i+" ");
            }
            System.out.println();

}
    }
}
