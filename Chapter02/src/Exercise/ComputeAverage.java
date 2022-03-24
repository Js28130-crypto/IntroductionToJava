package Exercise;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        //create a Scanner object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter three numbers
        System.out.println("Enter a number: ");
        double num1 = in.nextDouble();
        System.out.println("Enter a number: ");
        double num2 = in.nextDouble();
        System.out.println("Enter a number: ");
        double num3 = in.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println(" Average is: " + average);
    }
}
