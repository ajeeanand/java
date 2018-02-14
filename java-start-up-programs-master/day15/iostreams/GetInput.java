package blue.day15.iostreams;

import java.io.InputStream;
import java.util.Scanner;

public class GetInput {

    public static void main(String[] args) {

        //1. Using Scanner Class
        //Scanner class available in java.util package
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value 1 ");
        int x = s.nextInt();
        System.out.println("Enter value 2");
        int y = s.nextInt();
        int z = x + y;
        System.out.println(z);
        
    
    }
}
