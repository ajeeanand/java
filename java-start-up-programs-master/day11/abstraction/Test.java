package blue.day11.abstraction;

public abstract class Test {

    public abstract void goRun();

    public abstract void doSinging();

    public void doFacial() {
        System.out.println("Gold");
        System.out.println("Clay");
    }

    public void doFight() {
    }

    public static void methodOne() {
        System.out.println("Yes, im working stil.... ");
    }

    public static void main(String[] args) {
        // Test t = new Test();
        methodOne();
    }
}
