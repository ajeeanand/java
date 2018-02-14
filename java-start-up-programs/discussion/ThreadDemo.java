package blue.discussion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void main(String[] args) {
////        ThreadDemo td = new ThreadDemo();
////        Thread t = new Thread(td);
////        td.setName("ajeet");
////        t.start();
////        td.start();
    }
}
