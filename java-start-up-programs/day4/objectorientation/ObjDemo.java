package blue.day4.objectorientation;

public class ObjDemo {

    int x = 100;
    static int y = 200;

    public static void myMethod() {
        //System.out.println(x);
        System.out.println(y);
    }

    public void yourMethod() {
        System.out.println(x);
        System.out.println(y);

    }

    public static void main(String[] args) {
        myMethod();
        ObjDemo od = new ObjDemo();
        od.yourMethod();
    }
}
