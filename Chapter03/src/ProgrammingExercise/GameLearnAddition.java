package ProgrammingExercise;

import java.util.Scanner;

public class GameLearnAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);

        System.out.println(num1 + " + " + num2 + " = " + "?");
        int answer = in.nextInt();

        boolean sum = (num1 + num2 == answer) ? true : false;
        System.out.println(sum);
    }
}
