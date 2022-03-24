package ProgrammingExercise;

import java.util.Scanner;

public class AlgebraLinearEquations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        if ((a * d) - (b * c) == 0) {
            System.out.println("The equation has no solution!");
        } else {
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            System.out.println("x is: " + x);
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("y is: " + y);
        }
    }
}
