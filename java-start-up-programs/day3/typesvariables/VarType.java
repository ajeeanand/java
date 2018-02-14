package blue.day3.typesvariables;

public class VarType {

    int min = 100; //non static variable (instance variable)
    static int max = 500; //static variable (class variables)

    public static void methOne() {
        System.out.println("One");
        System.out.println("-------------- 1 : " + max);
      //  System.out.println("-----------ns 1 : " + min);
    }

    public static void methTwo(int x, int y) {
        int result = x + y;
        System.out.println("Result is : " + result);
        System.out.println("-------------- 2 : " + max);
    }

    public static int methThree() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("-------------- 3 : " + max);
        return c;
    }

    public static double methFour(double a, double b) {
        double c = a - b;
        System.out.println("-------------- 4 : " + max);
        return c;
    }

    public static void main(String[] args) {
        VarType.methOne();  //VarType.methOne();
        methTwo(10, 20);
        int res = methThree(); //30
        System.out.println(res);
        
        System.out.println(methFour(30.3, 20.1));
    }
}