package Exercise;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbersAndAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int count = 0;
        double total = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int numbers = in.nextInt();

        if (numbers == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }
        while (numbers != 0) {
            if (numbers > 0) {
                positive++;
            } else {
                negative++;
            }
            total += numbers;
            count++;
            numbers = in.nextInt();
        }
        double average = total / count;

        System.out.println("The number of positiv is\t" + positive + "\n"
                + "The number of negativ is\t" + negative + "\n" +
                "The total is:\t" + total + "\n" +
                "The average is:\t" + average);
    }
}
