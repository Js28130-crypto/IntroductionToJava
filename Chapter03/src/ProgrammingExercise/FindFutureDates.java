package ProgrammingExercise;

import java.util.Scanner;

public class FindFutureDates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter todays day: ");
        int todaysDay = in.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapses = in.nextInt();

        int futureDay = (todaysDay + daysElapses) % 7;

        System.out.println("Today is ");
        switch (todaysDay) {
            case 1:
                System.out.println();
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }

        System.out.println("and the future day is: ");
        switch (futureDay) {
            case 1:
                System.out.println();
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Errorrrrrrrrrrrrrrrrr!!!!!!!!!!!!!");
        }
    }
}