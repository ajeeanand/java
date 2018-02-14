/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.day9.polymorphism;

/**
 *
 * @author acadmy
 */
public class AddingTwo extends AddingOne {

    //a^2 + b^2
    @Override
    public int addition(int a, int b) {
        return (a * a) + (b * b);
    }

    public static void main(String[] args) {
        AddingTwo at = new AddingTwo();
        at.dummy();

        System.out.println(at.addition(11, 10));
    }
}
