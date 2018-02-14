package blue.discussion;

public class ThreadDemoPractice implements Runnable {

    @Override
    public void run() {
        try {
            Thread.currentThread().setName("varun");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
    }
    
    public static void main(String[] args) {
         Thread.currentThread().setName("sivaramakrishnan");
        System.out.println(Thread.currentThread().getName()); 
       ThreadDemoPractice td1 = new ThreadDemoPractice();  //Runnable Object
        Thread t1 = new Thread(td1);
        t1.start();
//        System.out.println(t1.getState());
        try { 
            Thread.sleep(6000);
             System.out.println(t1.getState());
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
   
}
}