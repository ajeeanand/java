/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.day2.identifiers;

/**
 *
 * @author acadmy
 */
public class SwitchDemo {

    public static void main(String[] args) {

        int ch = 6123;
        char cha = 'a';
        String str = "India";

        switch (str) {
            case "India":
                System.out.println("India is my country");
                break;
            case "Pak":
                System.out.println("Pakisthan is my country");
                break;
            case "afg":
                System.out.println("Bisilisthan is my country");
                break;
            case "bisi":
                System.out.println("Afganisthan is my country");
                break;
            default:
                System.out.println("Noting to Say");
        }
    }
}
