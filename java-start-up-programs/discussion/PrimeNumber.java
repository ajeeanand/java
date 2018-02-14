
package blue.discussion;


public class PrimeNumber {
    int a;
    PrimeNumber(int a){
        this.a = a;
    }
   public void PrimeNumber(){
           if (a/2==0) {
           System.out.println("it is a prime number");
           }
           else if (a/a==1){
           System.out.println("it is  a prime number");
            }
           
       }
       public static void main(String args[]) {
         PrimeNumber anu = new PrimeNumber(9);
           anu.PrimeNumber();
       }


}