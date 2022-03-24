package Exercise;

import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter v0,v1, and t: ");
        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println(a);
    }
}
