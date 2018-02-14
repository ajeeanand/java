package blue.day16.threadconcept;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadStates extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadStates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        ThreadStates ts = new ThreadStates();
        System.out.println(ts.getName() + "  : " + ts.getState());
        ts.start();
        try {
            Thread.currentThread().sleep(1000);
            System.out.println(ts.getState());
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadStates.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            Thread.currentThread().sleep(3000);
            System.out.println(ts.getState());
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadStates.class.getName()).log(Level.SEVERE, null, ex);
        }

        ts.start();
    }
}
