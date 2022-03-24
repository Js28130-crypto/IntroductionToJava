package ProgrammingExercise;

import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in.nextInt();
        System.out.println("Enter a number: ");
        int num2 = in.nextInt();
        System.out.println("Enter a number: ");
        int num3 = in.nextInt();

        int temp;
        if (num2 < num1 || num3 < num1) {
            if (num2 < num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num3 < num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        System.out.println(num1 + " < " + num2 + " < " + num3);

    }
}
