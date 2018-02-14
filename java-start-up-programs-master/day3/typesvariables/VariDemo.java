package blue.day3.typesvariables;

import java.lang.*;

public class VariDemo {

    int x = 50;
    
    //static block
    static {
        int x = 55;
    }

    //instance block
    {
        int x = 56;
    }
    
    public static void dummyCall(){
        System.out.println("Hello.. dummy call...");
    }
    
    //non static method without rt & pm
    public  void myMethod(){
        int x = 58;
        System.out.println(x);
    }
    
    //non static method with rt & without pm
    public  int yourMethod(){
        int x = 58;
        return x;
    }
    
     //non static method with rt & with pm
    public  int ourMethod(int x, int y){
        int z = x + y;
        return z;
    }
    
    public static void main(String[] args) {
        //Object creation is needed
        VariDemo vd = new VariDemo();
        vd.myMethod();
        int val = vd.yourMethod();
        System.out.println(val);
        int res = vd.ourMethod(100, 100);
        System.out.println(res);
    }
}
