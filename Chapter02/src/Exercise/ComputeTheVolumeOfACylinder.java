package Exercise;

import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double pi = 3.1419;

        System.out.println("Enter the radius and lenght of a cylinder: ");
        double radius = in.nextDouble();

        double length = in.nextDouble();


        double area = radius * radius * pi;
        double volume = area * length;

        System.out.println("The area is: " + area + "\n" + "The volume is: " + volume);
    }
}
