package blue.day8.inheritance;

public class B extends A {

    int a, b;

    public B() {
        super();
    }

    public B(int a, int b, int x, int y) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public void methodTwo() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
