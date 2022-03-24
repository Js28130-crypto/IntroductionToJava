package Exercise;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class PayrollGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter employee's name: ");


        String hoursInWeekString = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
        double hoursInWeek = Double.parseDouble(hoursInWeekString);

        String hourlyPayRateString = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double hourlyPayRate = Double.parseDouble(hourlyPayRateString);

        String federateTaxString = JOptionPane.showInputDialog("Enter federal tax withholding rate: ");
        double federateTax = Double.parseDouble(federateTaxString);

        String stateTaxString = JOptionPane.showInputDialog("Enter state tax withholding rate: ");
        double stateTax = Double.parseDouble(stateTaxString);

        double grossPay = hoursInWeek * hourlyPayRate;

        double federalWithHolding = (federateTax * grossPay) / 100;

        double stateWithHolding = (stateTax * grossPay) / 100;

        double totalDeduction = federalWithHolding + stateWithHolding;

        double netPay = grossPay + totalDeduction;

        //Display results
        String output = "Employee name:\t" + name + "\n" + "Hours Worked:\t" + hoursInWeek + "\n" +
                "Pay Rate:\t$" + hourlyPayRate + "\n" + "Gross Pay:\t$" + grossPay + "\n" +
                "Deductions: " + "\n" + "Federal Withholding (20.0%):\t\t$" + federalWithHolding + "\n" +
                "State Withholding:\t\t$" + stateWithHolding + "\n" + "Total Deduction:\t\t$" + totalDeduction + "\n" +
                "Net Pay:\t\t$" + netPay;
        JOptionPane.showMessageDialog(null, output);

    }
}
