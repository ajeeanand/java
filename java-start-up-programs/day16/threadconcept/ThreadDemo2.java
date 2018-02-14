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
public class ThreadDemo2 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Now Running : " + Thread.currentThread().getName());
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) {

        ThreadDemo2 td1 = new ThreadDemo2();  //Runnable Object
        Thread t1 = new Thread(td1);
        t1.start();

        Thread t2 = new Thread(td1);
        t2.start();

        Thread t3 = new Thread(td1);
        t3.start();

        Thread t4 = new Thread(td1);
        t4.start();

    }
}
