package blue.day11.abstraction;

public class ImpTest extends Test {

    @Override
    public void goRun() {
        System.out.println("Athelete");
    }

    @Override
    public void doSinging() {
        System.out.println("Karnatic");
    }
    
    public static void main(String[] args) {
        ImpTest it = new ImpTest();
        it.doFacial();
        it.doSinging();
        it.doFight();
        it.goRun();
    }
}
