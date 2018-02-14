/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.discussion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    public void one(){
        try {
            finalize();
        } catch (Throwable ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {

        int lastNo = 100;
        int toSub = 1;

        
        
        while (lastNo > 0) {
            System.out.print(lastNo);
            lastNo = lastNo - toSub;
            toSub++;
        }
    }
}
