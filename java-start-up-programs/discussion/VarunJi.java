/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.discussion;
import java.util.Scanner;
/**
 *
 * @author acadmy
 */
public class VarunJi {
    
    public static void main(String args[]) {
     
        VarunJi d= new VarunJi();
        Scanner s = new Scanner(System.in);
        String name;
        
        name = s.nextLine();
        System.out.println(name);
        float num = Float.parseFloat(name);
        System.out.println("in float " +num);
//        int integer = Integer.parseInt(name);
//        System.out.println("in int "+integer);
        String n1 = Float.toString(num);
        System.out.println("as string "+n1);
        int n2 = Integer.parseInt(name);          // ???????
        System.out.println(n2 +" as integer");
    
    } 
    
    
}
