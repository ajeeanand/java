package blue.day16.stringclass;

public class Test {

    String str1 = "India";
    String str2 = "Hello";
    String str3 = "India33";

    public void myMethod() {
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println(str3.hashCode());

        System.out.println("char at method : " + str1.charAt(2));
        System.out.println("concat method : " + str1.concat(" Wins"));
        str1 = str1.concat(" Wins");
        System.out.println(str1.equals("INDIA Wins"));
        System.out.println(str1.equalsIgnoreCase("InDiA WiNs"));
        System.out.println(str2.endsWith("lo"));
        System.out.println(str2.indexOf('l'));
        System.out.println(str2.isEmpty());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        //System.out.println(str1);

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.myMethod();
    }
}
