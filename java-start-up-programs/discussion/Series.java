
package blue.discussion;

public class Series {
    
    public static void main(String[] args) {
        
        float n,x;
        n=3;
        x=6;
        float sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum + (x/i);
        }
        System.out.println("The sum of series is : "+sum);
        
    }
    
}
