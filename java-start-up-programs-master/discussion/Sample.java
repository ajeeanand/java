package blue.discussion;


public class Sample {

    public static void main(String[] args) {
        int i, j, result, number;
        int arr[] = new int[10];    //={0,0,0,0,0,0,0,0,0,0};
        //int count=0;
        number = 1222567;
        while (number > 0) {
            result = number % 10;
            number /= 10;
//count++;
            arr[result]++;
        }
        for (i = 1; i <= 10; i++) {   //result=i;
            //System.out.print(+result);
            if (arr[i] != 0) {
                System.out.print(+i);
                for (j = 0; j < arr[i]; j++) {
                    System.out.print(" *");
                }
            }
            System.out.print(" ");
        }

    }
}
