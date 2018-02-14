package blue.day2.primitives;

public class PrimitiveDemo {

    static byte b = 0;
    static short s = 0;
    static int i = 0;
    static long l = 0;
    static float f = 0.0f;
    static double d = 0.0;
    static char c = 'a';
    static boolean bl = true;
    
    //true, false, null are not keywords but they are literals
    //as like keywords you cannot use them as identifier, they dont have functionalities
    //eg int false = 45; -> not permitted CTE

    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bl);
    }
}
