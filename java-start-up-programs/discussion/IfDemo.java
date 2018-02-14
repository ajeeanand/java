package blue.discussion;

public class IfDemo {

    public static void main(String[] args) {

        int num = 23433;
        int count = 0;
        int org = num;

        while (num > 0) {
            num = num/10;
            count++;
        }
        
        System.out.println("Total digits : " + count);
        

    }
}
// 51112
// ***

