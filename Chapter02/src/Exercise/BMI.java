package Exercise;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double punds = in.nextDouble();
        double weight = punds * 0.45359237;
        System.out.println("Enter height in inches: ");
        double inches = in.nextDouble();
        double height = inches * 0.0254;

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI is: " + bmi);


    }
}
