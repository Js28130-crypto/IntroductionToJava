package ProgrammingExercise;

import java.util.Random;
import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 15);
        int num3 = (int) (Math.random() * 5);


        System.out.println(num1 + " + " + num2 + " + " + num3 + " = ");
        int answer = in.nextInt();


        if (num1 + num2 + num3 == answer) {
            System.out.println("Correct! ");
        } else {
            System.out.println("The sum should be: " + num1 + " + " + num2 + " + " + num3 + " = " + answer);
        }


    }
}
