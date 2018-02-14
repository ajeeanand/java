/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.chef;

import java.util.Scanner;

/**
 *
 * @author acadmy
 */
public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println("Please enter the sentence:");
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        char[] c=word.toCharArray();
        char cc[]=new char[80];
        int j=0;
        for (int i = 0; i <c.length; i++) {
            if (c[i]=='a'|| c[i]=='e' || c[i]=='i'||c[i]=='o'||c[i]=='u') {
                continue;
            }
            else{
            
            cc[j]=c[i];
            j++;
            }
        }
        System.out.println("After Removing vowels from a sentence");
        System.out.println(cc);
    }
}
