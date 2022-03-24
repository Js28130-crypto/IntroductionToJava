package Exercise;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = in.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = in.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter number of Years:");
        double year = in.nextDouble();
        year = year * 12;

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, year);
        System.out.println("Acumulated value is: " + futureInvestmentValue);
    }
}
