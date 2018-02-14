package blue.day8.accessmodi1;

public class One {

    public void methOne() {
        System.out.println("Public");
    }

    private void methTwo() {
        System.out.println("Private");
    }

    protected void methThree() {
        System.out.println("Protected");
    }

    void methFour() {
        System.out.println("default...");
    }

    public static void main(String[] args) {
        One one = new One();
        one.methOne();
        one.methTwo();
        one.methThree();
        one.methFour();
    }
}
