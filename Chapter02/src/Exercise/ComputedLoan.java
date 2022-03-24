package Exercise;

import java.util.Scanner;

public class ComputedLoan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the interest rate");
        double interestRate=in.nextDouble();

        double monthlyInterestRate=interestRate/1200;

        System.out.println("enter number of years in integer: ");
        int numOfYears=in.nextInt();

        System.out.println("Enter the looan amount");
        double loanAmount=in.nextDouble();

        double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numOfYears*12));
        double totalPayment=monthlyPayment*numOfYears*12;




    }
}
