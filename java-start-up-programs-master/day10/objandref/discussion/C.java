package blue.day10.objandref.discussion;

public class C extends B{

    public void three() {
        System.out.println("C - Three");
    }
    
    public static void main(String[] args) {
        A a1 = new A();
        a1.one();
        
        A a2 = new B();
        a2.one();
        
        A a3 = new C();
        a3.one();
        
    }
}
