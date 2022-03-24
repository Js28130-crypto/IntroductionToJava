package Exercise;

import java.util.Scanner;

public class NrOfYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = in.nextInt();

        // Compute the number of years and days
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        // Display results
        System.out.println(minutes + " minutes is approximately " + years
                + " years and " + days + " days");

    }
}