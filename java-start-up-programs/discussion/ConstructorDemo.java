
package blue.discussion;


public class ConstructorDemo {
  String  Name;
     int a,b,c;
    public ConstructorDemo(int a, int b) {
        this.a = a;
        this.b = b;
       
    }
    
  
    public void plus(){
    c=a+b;
        System.out.println("sum is :" + c);
    }
    public int sub(){
    c=a-b;
        return c;
    }
    public void mul(){
    c=a*b;
    System.out.println("multiplication is :" +c);
    }
    public void div(){
    c=b/a;
        System.out.println("div is :" + c);
          
    }
    public static void main(String args[]) {
     ConstructorDemo anu = new ConstructorDemo(10,20);
     anu.plus();
     int c = anu.sub();
     System.out.println("difference is : " + c);

     anu.mul();
     anu.div();
    }
}
