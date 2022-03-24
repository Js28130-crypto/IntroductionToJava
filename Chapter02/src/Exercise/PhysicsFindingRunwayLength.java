package Exercise;

import java.util.Scanner;

public class PhysicsFindingRunwayLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter speed an acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();
        double length = (Math.pow(speed, 2)) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is: " + length);
    }
}
