/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blue.day16.threadconcept;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acadmy
 */
public class BankingProcess {

    public static double availBal = 5000;

    public void deposit(double amt) {
        availBal = amt + availBal;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BankingProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void withdraw(double amt) {
        availBal = availBal - amt;
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BankingProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
