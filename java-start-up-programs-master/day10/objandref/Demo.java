package blue.day10.objandref;

public class Demo {

    public void methodOne() {
        System.out.println("Hello - non static");
    }

    public static void methodTwo() {
        System.out.println("Hello - static");
    }

    public static void main(String[] args) {
        Demo d = new Demo(); //ref with object 
        d.methodOne();
        int x = 10; //variable with value
        System.out.println(10);
    }
}
