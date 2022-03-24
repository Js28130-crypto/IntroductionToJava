package Exercise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        double num1 = in.nextDouble();
        double remainder = num1 % 10;
        double sum = 0;
        sum = sum + remainder;
        double divide = (int) num1 / 10;
        double secRemainder = divide % 10;
        sum = sum + secRemainder;
        double secDivide = divide / 10;
        sum += (int) secDivide;
        System.out.println("The sum of digits is: " + sum);

    }
}
