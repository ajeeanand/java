package blue.discussion;

//import java.util.Scanner;

public class Codechef {
    //static double L=20, F=30, P=20, F1=2, P1=0, F2=0, P2=2, S1=23, S2=21;

    static double L=10, F=50, P=40, F1=2, P1=0, F2=0, P2=2, S1=25, S2=19;
    // for axis intercepts
    static double x1, y1 = 0.0, x2 = 0.0, y2;
    // for intercepts betweeen axis
    static double xa, ya;                 // for L and F
    static double xb, yb;                 // for L and P
    static double xc, yc;                 // for F and P
    //to know which profits are to be calculate according to feasible region
    static int select_a = 0, select_b = 0, select_c = 0;
    //all possible profits
    static double profit_1 = 0;
    static double profit_2 = 0;
    static double profit_a = -10;       //for comparing to know whether 
    static double profit_b = -20;       //more than one profits are same
    static double profit_c = -30;       //also for the reason that 0 will satisty equality
    static double max_profit;


//    public void getData(String input1) {
//
//        String ip[] = input1.split(",");
//        L = Float.parseFloat(ip[0]);
//        F = Float.parseFloat(ip[1]);
//        P = Float.parseFloat(ip[2]);
//        F1 = Float.parseFloat(ip[3]);
//        P1 = Float.parseFloat(ip[4]);
//        F2 = Float.parseFloat(ip[5]);
//        P2 = Float.parseFloat(ip[6]);
//        S1 = Float.parseFloat(ip[7]);
//        S2 = Float.parseFloat(ip[8]);
//
//    }

    public String paraSatisfy() {
        if (L < 0 || F < 0 || P < 0 || F1 < 0 || F2 < 0 || P1 < 0 || P2 < 0) {
            return "-1";
        }
        //using else is of no use here
        return null;
    }

    public void findIntercepts() {
        // there are totally 6 intercepts with axis....3 with x axis...3 with y axis
        // in which 1 in x and 1 in y is enough for feasible region

        x1 = Math.min(F / F1, P / P1);
        x1 = Math.min(x1, L);

        y2 = Math.min(F / F2, P / P2);
        y2 = Math.min(y2, L);

        xa = (F - (L * F2)) / (F1 - F2);
        ya = ((L * F1) - F) / (F1 - F2);

        xb = (P - (L * P2)) / (P1 - P2);
        yb = ((L * P1) - P) / (P1 - P2);

        xc = (F * P2 - P * F2) / (F1 * P2 - P1 * F2);
        yc = (F * P1 - P * F1) / (F2 * P1 - P2 * F1);

        //to find the coorditates and select them in feasible region
        if ((xa + ya <= xb + yb) && (xa + ya <= xc + yc) && xa > 0 && ya > 0) {
            select_a = 1;
        }
        if ((xb + yb <= xa + ya) && (xb + yb <= xc + yc) && xb > 0 && yb > 0) {
            select_b = 1;
        }
        if ((xc + yc <= xa + ya) && (xc + yc <= xb + yb) && xc > 0 && yc > 0) {
            select_c = 1;
        }

    }       //end of find intercept
    
    public String findProfit() {

        // profit = S1 * x + S2 * y

        profit_1 = S1 * x1;
        profit_2 = S2 * y2;
        System.out.println("profit 1 "+profit_1);
        System.out.println("profit 2 "+profit_2);
         if (select_a==1) {
            profit_a = S1 * xa + S2 * ya;
            System.out.println("profit a "+profit_a);
        }
        if (select_b==1) {
            profit_b = S1 * xb + S2 * yb;
            System.out.println("profit b "+profit_b);            
        }
        if (select_c==1) {
            profit_c = S1 * xc + S2 * yc;
            System.out.println("profit c "+profit_c);            
        }

        max_profit = Math.max(profit_1, profit_2);
        max_profit = Math.max(max_profit, profit_a);
        max_profit = Math.max(max_profit, profit_b);
        max_profit = Math.max(max_profit, profit_c);

        if(max_profit == profit_1)
        {
            if((max_profit==profit_2)||(max_profit==profit_a)||(max_profit==profit_b)||(max_profit==profit_c))
                return "-1";
            else
                return String.format("%.2f", max_profit) + "," + String.format("%.2f", x1) + "," + String.format("%.2f", y1);
        }
        if(max_profit == profit_2)
        {
            if((max_profit==profit_1)||(max_profit==profit_a)||(max_profit==profit_b)||(max_profit==profit_c))
                return "-1";
            else
                return String.format("%.2f", max_profit) + "," + String.format("%.2f", x2) + "," + String.format("%.2f", y2);
        }
        if(max_profit == profit_a)
        {
            if(max_profit==profit_1||max_profit==profit_2||max_profit==profit_b||max_profit==profit_c)
                return "-1";
            else
                return String.format("%.2f", max_profit) + "," + String.format("%.2f", xa) + "," + String.format("%.2f", ya);
        }
        if(max_profit == profit_b)
        {
            if((max_profit==profit_1)||(max_profit==profit_2)||(max_profit==profit_a)||(max_profit==profit_c))
                return "-1";
            else
                return String.format("%.2f", max_profit) + "," + String.format("%.2f", xb) + "," + String.format("%.2f", yb);
        }
        if(max_profit == profit_c)
        {
            if((max_profit==profit_1)||(max_profit==profit_2)||(max_profit==profit_a)||(max_profit==profit_b))
                return "-1";
            else
                return String.format("%.2f", max_profit) + "," + String.format("%.2f", xc) + "," + String.format("%.2f", yc);
        }

        
        
        return "-1";
    }   //end of findProfit

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();
        String result;

        Codechef d = new Codechef();
//        d.getData(input);
        String check = d.paraSatisfy();

        if (check == null) {
            d.findIntercepts();
            result = d.findProfit();
            System.out.println(result);
        } else {
            result = check;
            System.out.println(result);
        }

    }   //end of main
}       //end of class
