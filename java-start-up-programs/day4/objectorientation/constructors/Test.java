package blue.day4.objectorientation.constructors;

public class Test {

    static int x = 10;
    static int y;
    int a = 10;
    int b;
    double c;
    static int count = 0;

    //static block 
    static {
        Test.x = 10;
        Test.y = 0;
    }

    //instance block
    {
        count++;
    }

    //Default Constructor
    public Test() {
        this.a = 10;
        this.b = 0;
        this.c = 0.0;
    }

    public void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a); //t.a
        System.out.println(b); //t.b
        System.out.println(c); //t.c
    }

    public static void main(String[] args) {
        // System.out.println("+++++++++++++++++++++");
        Test t = new Test();
        t.b = 45;
        t.c = 50;
        t.display();
        Test t1 = new Test();
        t1.b = 67;
        t1.c = 89;
        t1.display();
        Test t2 = new Test();
        t2.display();

        System.out.println(count);
    }
}
