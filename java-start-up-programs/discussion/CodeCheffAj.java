
package blue.discussion;
public class CodeCheffAj {
    int x,y;
    int ori;
    static int temp1, count1=0;
    int wor;
    public CodeCheffAj(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void Calc(){
        ori=x-y;
       temp1=ori;
     while(temp1>0)
        {
        temp1=temp1/10;
        count1++;
        }
        System.out.println("the correct ans :" + ori);
        switch (count1)
        {
            case 1 :if (ori==9) {
                    wor = ori-1;
                     System.out.println("waiters ans :" + wor);
                }
                else {
                wor = ori + 1;
                System.out.println("waiters ans :" + wor);
            }
            break;
            case 2 :
                if (ori>=10 && ori<=19 ) {
                    wor = ori+1;
                     System.out.println("waiters ans :" + wor);
                }
                else {
                wor = ori -10;
                System.out.println("waiters ans :" + wor);
                }
            break;
            case 3 :
                 if (ori>=100 && ori<=199 ) {
                    wor = ori+10;
                     System.out.println("waiters ans :" + wor);
                }
                else {
                wor = ori -100;
                System.out.println("waiters ans :" + wor);
                }
            break;
            case 4 :
                if (ori>=1000 && ori<=1999 ) {
                    
                    wor = ori+100;
                     System.out.println("waiters ans :" + wor);
                }
                else {
                wor = ori -1000;
                System.out.println("waiters ans :" + wor);
                }
            break;
//            case 5 :
//                 if (ori>=10000 && ori<=10009 ) {
//                    wor = ori+1000;
//                     System.out.println("waiters ans :" + wor);
//                }
//                else {
//                wor = ori -10000;
//                System.out.println("waiters ans :" + wor);
//                }
//                break;
            default :
                System.out.println("enter maximum five digit number");
        }
    }

    public static void main(String args[]) {
     CodeCheffAj d = new CodeCheffAj(1245,215);  
     d.Calc();
      
        }
    }


