package Exercise;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of feets");
        double feet = in.nextDouble();

        double meters = feet / 3.281;
        System.out.println(feet + " feet" + " is" + meters + " meters");

    }
}
