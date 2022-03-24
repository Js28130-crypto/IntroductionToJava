package Exercise;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = in.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double hoursInWeek = in.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double hourlyPayRate = in.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federateTax = in.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTax = in.nextDouble();

        double grossPay = hoursInWeek * hourlyPayRate;

        double federalWithHolding = (federateTax * grossPay) / 100;
        double stateWithHolding = (stateTax * grossPay) / 100;
        double totalDeduction = federalWithHolding + stateWithHolding;
        double netPay = grossPay - totalDeduction;

        //print
        System.out.println("Employee Name: " + name + "\n" +
                "Hours Worked: " + hoursInWeek + "\n" +
                "Pay Rate: " + hourlyPayRate + "\n" +
                "Gross Pay: " + grossPay + "\n" +
                "Deductions: " + "\n" +
                "\t" + "Federal Withholding (20.0%):\t" + federalWithHolding + "\n" +
                "\t" + "State Withholding (9.0%):\t" + stateWithHolding + "\n" +
                "\t" + "Total Deduction:\t" + totalDeduction + "\n" +
                "Net Pay:\t\t" + netPay);

    }
}
