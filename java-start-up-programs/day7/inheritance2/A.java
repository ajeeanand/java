
package blue.day7.inheritance2;


public class A extends Object{
    
    int a, b, c, d, e, f;

    public A() {
        super();
    }

    public A(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

  
   
    
    public void dummy(){
        System.out.println("A class dummy");
    }
    
    public static void main(String[] args) {
        A a = new A();
        
    }
    
    
}
