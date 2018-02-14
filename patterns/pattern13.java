
package com.patterns;

public class pattern13 {
     public static void main(String[] args) {
        int y = 66;
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j < y; j++) {
                System.out.print((char) i);
            }
            System.out.println();
            y++;
        }
    }
}
