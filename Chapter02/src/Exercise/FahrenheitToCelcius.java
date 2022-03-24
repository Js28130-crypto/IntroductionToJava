package Exercise;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = in.nextDouble();

        double celcius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celcius + "Celcius");

        System.out.println("Enter a degree in Celcius");
        double celccius = in.nextDouble();
        double fahrenheiit = (9.0 / 5.0) * celccius + 32;
        System.out.println("Celcius " + celccius + " is " + fahrenheiit);


    }
}
