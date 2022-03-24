package Exercise;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = in.nextDouble();
        double gratuity = in.nextDouble();
        double gratuityRate = (subtotal * gratuity) / 100;
        double total = gratuityRate + subtotal;
        System.out.println("The gratuity is " + gratuityRate + " and total is " + total);
    }
}
