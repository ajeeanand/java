package blue.day7.inheritance2;

public class Demo extends Test {

    int y;

    public Demo() {
        super();
        this.y = 0;
    }

    public Demo(int y, int x) {
        super(x);
        this.y = y;
    }

    public void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Demo d = new Demo(10, 20);
        d.display();
        d.show();
    }
}
