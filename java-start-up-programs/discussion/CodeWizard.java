package blue.discussion;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Karthik
 */
public class CodeWizard {

    public String getTotalProfit(String input1) {

        String ip[] = input1.split(",");
        float L = Float.parseFloat(ip[0]);
        float F = Float.parseFloat(ip[1]);
        float P = Float.parseFloat(ip[2]);
        float F1 = Float.parseFloat(ip[3]);
        float P1 = Float.parseFloat(ip[4]);
        float F2 = Float.parseFloat(ip[5]);
        float P2 = Float.parseFloat(ip[6]);
        float S1 = Float.parseFloat(ip[7]);
        float S2 = Float.parseFloat(ip[8]);
        float totalRiceInsecUsed = 0.0f;
        float totalRiceFertUsed = 0.0f;
        float totalWheatInsecUsed = 0.0f;
        float totalWheatFertUsed = 0.0f;
        float areaOfWheat = 0.0f;
        float areaOfRice = 0.0f;
        float amount = 0.0f;
        float Y = (P2 * F - F2 * P) / (F1 * P2 - F2 * P1);
        float X = (-P1 * F + F1 * P) / (F1 * P2 - F2 * P1);
        if ((Y < 0) || (X < 0)) {
            return "-1";
        }
        while (true) {
            if ((L == areaOfRice + areaOfWheat) || (P == totalRiceInsecUsed + totalWheatInsecUsed) || (F == totalRiceFertUsed + totalWheatFertUsed) || (F2 == 0) || (F1 == 0) || (P2 == 0) || (P1 == 0)) {
                break;
            } else {
                float calRiceProfit = Math.min(F / F2, P / P2) * S2;
                float calWheatProfit = Math.min(F / F1, P / P1) * S1;
                if (calRiceProfit > calWheatProfit) {
                    float areaInsecUsed = P / P2;
                    float areaFertUsed = F / F2;
                    if (areaInsecUsed > areaFertUsed) {
                        L = L - areaFertUsed;
                        F2 = 0;
                        totalRiceFertUsed = totalRiceFertUsed + F2;
                        areaOfRice = areaOfRice + areaFertUsed;
                        amount = amount + areaFertUsed * S2;
                    } else if (areaInsecUsed < areaFertUsed) {
                        L = L - areaInsecUsed;
                        P2 = 0;
                        totalRiceInsecUsed = totalRiceInsecUsed + areaInsecUsed;
                        areaOfRice = areaOfRice + areaInsecUsed;
                        amount = amount + areaInsecUsed * S2;
                    } else {
                        areaInsecUsed = P / P1;
                        areaFertUsed = F / F1;
                        if (areaInsecUsed > areaFertUsed) {
                            L = L - areaFertUsed;
                            F1 = 0;
                            totalWheatFertUsed = totalWheatFertUsed + F1;
                            areaOfWheat = areaOfWheat + areaFertUsed;
                            amount = amount + areaFertUsed * S1;
                        } else if (areaInsecUsed < areaFertUsed) {
                            L = L - areaInsecUsed;
                            P1 = 0;
                            totalWheatInsecUsed = totalWheatInsecUsed + areaInsecUsed;
                            areaOfWheat = areaOfWheat + areaInsecUsed;
                            amount = amount + areaInsecUsed * S1;
                        }
                    }

                }
            }
        }
        return String.format("%.2f", amount) + "," + String.format("%.2f", areaOfWheat) + "," + String.format("%.2f", areaOfRice);

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        CodeWizard cw = new CodeWizard();
        String result = cw.getTotalProfit(input);
        System.out.println(result);
    }
}
