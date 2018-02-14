package blue.day8.inheritance;

public class A {

    int x;
    int y;

    public A() {
        super();
    }

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void methodOne() {
        System.out.println(x);
        System.out.println(y);
    }
}
