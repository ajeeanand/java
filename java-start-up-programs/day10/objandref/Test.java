package blue.day10.objandref;

public class Test extends Demo {

    public void behaviourOne() {
        System.out.println("Hai - non static");
    }

    public static void behaviourTwo() {
        System.out.println("Hai - static");
    }

    @Override
    public void methodOne(){
        System.out.println("Hai - overrided method");
    }
    public static void main(String[] args) {


        //Sub class ref = sub class obj : (sup+sub)
        Test t = new Test();
        t.behaviourOne();
        t.methodOne();

        //super class ref = super class obj (sup)
        Demo d = new Demo();
        d.methodOne();

        //Not possible
        //Test t3 = new Demo();
        int x = (int)20.5;
        Demo d1 = new Test();
        Test t2 = (Test) d1;

        t2.behaviourOne();
        t2.methodOne();

        d1.methodOne();

    }
}
