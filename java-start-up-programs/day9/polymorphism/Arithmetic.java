package blue.day9.polymorphism;

public class Arithmetic {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b ;
    }
    
    public static void main(String[] args) {
        Arithmetic arith = new Arithmetic();
        System.out.println(arith.add(10 , 10));
        System.out.println(arith.add(10.10 , 5.10));
        System.out.println(arith.add(10 , 15, 10));
    }
}
