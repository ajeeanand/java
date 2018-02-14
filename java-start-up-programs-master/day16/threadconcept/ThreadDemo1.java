package blue.day16.threadconcept;

import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * 1. Create a class and extend to Thread class 2. override run() method from
 * Thread Class 3. create object for your class 'thread class' 4. call the run()
 * method by triggering start() method
 */
public class ThreadDemo1 extends Thread {

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
        ThreadDemo1 td1 = new ThreadDemo1();  //Thread object
        ThreadDemo1 td2 = new ThreadDemo1();
        ThreadDemo1 td3 = new ThreadDemo1();
        ThreadDemo1 td4 = new ThreadDemo1();
        System.out.println(Thread.currentThread().getName());
        //td1.run();//it is considered as common method call
        td1.start(); //initializing thread activity here..
        td2.start();
        td3.start();
        td4.start();
    }
}
