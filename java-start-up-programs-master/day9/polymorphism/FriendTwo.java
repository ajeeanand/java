/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.day9.polymorphism;

/**
 *
 * @author acadmy
 */
public class FriendTwo extends FriendOne {

 
    @Override
    public void heroPen() {
        System.out.println("Neat Writing");
        System.out.println("Blue ink Color");
    }

    public void examPad() {
        System.out.println("Help to hold the sheets..");
    }

    public void watch() {
        System.out.println("I will help to track your timing");
    }

    public void hallTicket() {
        System.out.println("All details : )");
    }

    public static void main(String[] args) {
        FriendTwo ft = new FriendTwo();
        ft.scale();
        ft.examPad();
        ft.hallTicket();
        ft.pencil();
        ft.heroPen();
       // ft.heroPen2();
        ft.watch();
        ft.eraser();
    }
}
