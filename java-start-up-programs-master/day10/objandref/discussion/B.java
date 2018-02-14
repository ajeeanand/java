package blue.day10.objandref.discussion;

public class B extends A{

    @Override
    public void one(){
        System.out.println("B - One");
    }
    
    public void two() {
        System.out.println("B - Two");
    }
    
    public static void main(String[] args) {
        A a2 = new B();
        a2.one();
    }
}
