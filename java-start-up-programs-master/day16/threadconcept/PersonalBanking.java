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
public class PersonalBanking {

    BankingProcess bp = new BankingProcess();

    public void startActivity() {



        Runnable per1 = new Runnable() {

            public void run() {
                bp.deposit(10000);
            }
        };


        Runnable per2 = new Runnable() {

            public void run() {
                bp.withdraw(5000);
            }
        };

        Runnable per3 = new Runnable() {

            public void run() {
                bp.deposit(15000);
            }
        };

        Runnable per4 = new Runnable() {

            public void run() {
                System.out.println("------------------");
                bp.withdraw(11000);
            }
        };




        Thread t1 = new Thread(per1);
        Thread t2 = new Thread(per2);
        Thread t3 = new Thread(per3);
        Thread t4 = new Thread(per4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        Thread t5 = new Thread(new Runnable() {

            public void run() {
            }
        });


        try {
            Thread.currentThread().sleep(2000);
            System.out.println(BankingProcess.availBal);
        } catch (InterruptedException ex) {
            Logger.getLogger(PersonalBanking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        PersonalBanking pb = new PersonalBanking();
        pb.startActivity();
    }
}
