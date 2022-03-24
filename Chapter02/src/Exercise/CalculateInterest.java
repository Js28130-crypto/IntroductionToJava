package Exercise;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: ");
        double balance = in.nextDouble();
        double interestRate = in.nextDouble();
        double interest = balance * (interestRate / 1200);
        System.out.println("The interest rate is: " + interest);

    }
}
