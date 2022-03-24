package ProgrammingExercise;

import java.util.Scanner;

public class AlgebraQuadraticEquations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c : ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        //first formula>>>>>>>>>>>>>
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        System.out.println("The equation has: ");
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The root is: " + r1);
        } else {
            System.out.println("no real roots");
        }
    }
}
