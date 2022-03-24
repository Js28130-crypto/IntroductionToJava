package ProgrammingExercise;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in.nextInt();

        if (num1 % 6 == 0 && num1 % 5 == 0) {
            System.out.println(num1 + " is divisible by 5 or 6");
        } else if (num1 % 6 == 0 || num1 % 5 == 0) {
            System.out.println(num1 + " is divisible by 5 or 6, but not both");
        } else {
            System.out.println(num1 + " is not divisible by either 5 or 6");
        }
    }
}
