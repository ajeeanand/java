/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.discussion;

/**
 *
 * @author acadmy
 */
public class Hierarchical3 extends HierarachicalInheritance{
    public void methodThree()
            {
                System.out.println("This is methodThree");
            }
    public static void main(String[] args) {
        Hierarchical3 h3=new Hierarchical3();
        h3.methodThree();
        h3.methodOne();
       
                
    }
}
