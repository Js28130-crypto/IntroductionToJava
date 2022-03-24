package Exercise;

import java.util.Scanner;

public class PoundsIntoKilogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pound = in.nextDouble();
        double kilogram = pound / 2.202;
        System.out.println(pound + " pound is " + kilogram + " kilogram");
    }
}
