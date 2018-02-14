package blue.discussion;

public class Landprofit {
//    float L=10,F=10,P=5,F1=2,P1=2,F2=3,P2=1,S1=14,S2=25;
//    float x11,x12=0.0f,x21=0.0f,x22;
//    float x1=0,x2=0;

    static double L = 10, F = 10, P = 5, F1 = 2, P1 = 2, F2 = 3, P2 =1, S1 = 14, S2 = 25;
    static double x11, x12 = 0.0f, x21 = 0.0f, x22;
    static double x1 = 0, x2 = 0;
    static double profit;

    public String paraSatisfy() {
        if ((F2 <= 0f && P2 <= 0f) || (F2 <= 0f && F1 <= 0f) || (P1 <= 0f && P2 <= 0f) || (F1 <= 0f && P1 <= 0f) )
      //  if (F / F2 > L || P / P2 > L || F / F1 > L || P / P1 > L ) // x2 of F, x2 of P and x1 of F and x2 of P should be less than or equal to L
        {
            return "-1";
        }
//      else if ((F2 <= 0f && P2 <= 0f) || (F2 <= 0f && F1 == 0f) || (P1 <= 0f && P2 <= 0f) || (F1 <= 0f && P1 <= 0f)) {
//            return "-1";
//      }

        return null;

    }

    public void findIntercept() {
        if ((F / F1 <= P / P1 && P / P2 <= F / F2) || (F / F1 >= P / P1 && P / P2 >= F / F2)) // only 2 intercepts...so 4 parameters (2 for each)
        {                                   // (x11,x12) = (x11,0)for x1 axis and (x21,x22)= (0,x22) for x2 axis
            x12 = x21 = 0.0f;
            if (F / F1 <= P / P1) // for x1 axis
            {
                x11 = F / F1;
            } else {
                x11 = P / P1;
            }

            if (F / F2 <= P / P2) // for x2 axis
            {
                x22 = F / F2;
            } else {
                x22 = P / P2;
            }
        } else // if statement is not necessary since that is the only possibility
        {                                  // F1<P1 and P2<F2 and bla bla bla doesnt matter here
            x12 = x21 = 0.0f;
            if (F / F1 < P / P1) // for x1 axis
            {
                x11 = F / F1;
            } else {
                x11 = P / P1;
            }

            if (F / F2 < P / P2) //for x2 axis
            {
                x22 = F / F2;
            } else {
                x22 = P / P2;
            }
            x1 = (F * P2 - P * F2) / (F1 * P2 - P1 * F2);
            x2 = (F * P1 - P * F1) / (F2 * P1 - P2 * F1);
        }
    }

    public String findProfit() {

        double procheck1, procheck2, procheck3;
        procheck1 = S1 * x11;
        procheck2 = S2 * x22;
        procheck3 = (S1 * x1) + (S2 * x2);
        if (x1 == 0 || x2 == 0) // checking for no. of feasible region intercepts: either 2 or 3
        {                           // if condition is true, then only 2 intercepts at both axeses
            if (procheck1 > procheck2) {
                profit = procheck1;
                return String.format("%.2f", profit) + "," + String.format("%.2f", x11) + "," + String.format("%.2f", x12);
            } else if (procheck1 < procheck2) {
                profit = procheck2;
                return String.format("%.2f", profit) + "," + String.format("%.2f", x21) + "," + String.format("%.2f", x22);
            } else if (procheck1 == procheck2) // if statement not necessary
            {
                profit = procheck2;
                return String.format("%.2f", profit) + "," + String.format("%.2f", x21) + "," + String.format("%.2f", x22);
            }
        } else {
            if (procheck1 > procheck2 && procheck1 > procheck3) {
                profit = procheck1;
                return String.format("%.2f", profit) + "," + String.format("%.2f", x11) + "," + String.format("%.2f", x12);
            } else if (procheck2 > procheck1 && procheck2 > procheck3) {
                profit = procheck2;
                return String.format("%.2f", profit) + "," + String.format("%.2f", x21) + "," + String.format("%.2f", x22);
            } else if (procheck3 > procheck1 && procheck3 > procheck2) // if statement not necessary due to the reason that all other possible combinations
            {                                                           // are removed in the conditions used in other statements
                profit = procheck3;
                return String.format("%.2f", profit) + "," + String.format("%.2f", x1) + "," + String.format("%.2f", x2);
            }
        }
        return "dummy";                  // never executes
    }

    public static void main(String[] strg) {
        Landprofit para = new Landprofit();
        String check = para.paraSatisfy();
        if (check == null) {
            para.findIntercept();
            String output = para.findProfit();
            System.out.println(output);
        } else {
            System.out.println(check);
        }

    }
}
