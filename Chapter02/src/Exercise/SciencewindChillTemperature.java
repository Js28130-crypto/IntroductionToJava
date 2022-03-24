package Exercise;

import java.util.Scanner;

public class SciencewindChillTemperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperature = in.nextDouble();
        System.out.println("Enter the wind speed in miles per hour: ");
        double speed = in.nextDouble();

        double windchill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

        System.out.println("The wind chill index is: " + windchill);

    }
}
