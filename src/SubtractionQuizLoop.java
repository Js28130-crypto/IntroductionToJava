import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUMBER_OF_QUESTION = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        while (count < NUMBER_OF_QUESTION) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            int temp;
            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("What is " + num1 + " + " + num2 + "? ");
            int answer = in.nextInt();

            if (num1 + num2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("You are answer is wrong\n" + num1 + " + " + num2 +" =\t "+ (num1 + num2));
            }
            count++;
            output += "\n" + num1 + " + " + num2 + " = " + answer + ((num1 + num2 == answer) ? " correct" : " wrong");
        }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;
        System.out.println("Correct count is "+correctCount+"\nTest time is "+testTime/1000+" seconds\n"+output);

    }
}
