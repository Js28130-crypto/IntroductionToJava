package Exercise;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double save = in.nextDouble();
        double annualInterest = 0.05 / 12;
        System.out.println(annualInterest);
        double fMonth = save * (1 + annualInterest);
        double sMonth = (save + fMonth) * (1 + annualInterest);
        double thMonth = (save + sMonth) * (1 + annualInterest);
        double fourthMonth = (save + thMonth) * (1 + annualInterest);
        double fifthMonth = (save + fourthMonth) * (1 + annualInterest);
        double sixMonth = (save + fifthMonth) * (1 + annualInterest);

        //System.out.println("After the sixht month, the account value is: "+sixMonth);
        // System.out.println("After the sixth month, the account value is: "+save*(6/annualInterest));
    }
}
