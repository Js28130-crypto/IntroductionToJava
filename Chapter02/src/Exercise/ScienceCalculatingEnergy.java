package Exercise;

import java.util.Scanner;

public class ScienceCalculatingEnergy {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of water in kolograms: ");
        double water = in.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemp = in.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemperature = in.nextDouble();
        double q = water * (finalTemperature - initialTemp) * 4184;
        System.out.println("The energy needed is: " + q);
    }
}
