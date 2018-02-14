
package com.patterns;

import java.util.Scanner;


public class pattern79 {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = s.nextInt();
         int i, j, k=1;
        for(i=0; i<r; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print((char)(65+j) + " ");
            }
            k = k + 2;
            System.out.println();
        }
    } 
}
