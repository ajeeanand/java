
package blue.discussion;
import java.util.Scanner;
public class Caterpie {
    
    static Scanner scan = new Scanner(System.in);
    static String size;
    static String input;
    static int m;
    static int a[] = new int[2500];
    static int b[][]=new int[51][51];
    static int nine[]=new int[9];
    static int small;
    
    public void assignValues(String input1)
    {
    
         //String ip[] = input1.split(",");
         String ip = input1.replaceAll("#", ",");   // all the # is replaced by comma
         String str[] = ip.split(",");
//         for (int i = 0; i < m*m; i++) {
//             System.out.println(str[i]);
//        }
         for (int i = 0; i < m*m; i++) {
            a[i]= Integer.parseInt(str[i]);
             System.out.println(a[i]);              // a[i] has all the individual values in an array with type "int"
        }
         int k=0;
         for(int i=0;i<=m+1;i++)                    //for positions of all borders are assigned infinity and
         {                                          //the rest inside are given ordered values
             for (int j = 0; j <= m+1; j++) {
                 if(i==0 || j==0)
                     b[i][j]=1/0;
                 if(i==m+1 || j==m+1)
                     b[i][j]=1/0;
                 else
                 {
                     b[i][j]=a[k];
                     k++;
                 }
             }
         }
    } 
//    
    
}
