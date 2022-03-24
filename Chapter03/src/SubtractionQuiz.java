import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("What is " + num1 + " - " + num2 + " = " + " ?");
        int answer = in.nextInt();

        if (num1 - num2 == answer) {
            System.out.println("You are correct");
        } else {
            System.out.println("Your answer is wrong\n" + num1 + " - " + num2 + " is " + (num1 - num2));
        }
    }
}
