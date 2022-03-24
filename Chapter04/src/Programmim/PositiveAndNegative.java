package Programmim;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int positive=0; // count the number of positive numbers
        int negative =0; // count the number of negative numbers
        int count=0; //count all numbers
        double total=0; //acumulate a total

        //prompt the user to enter an integer or 0 to exit
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int number=in.nextInt();

        if (number==0){//test for sentinel value
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number!=0){
            if (number>0)
                positive++; //increase positive
            else
                negative++; //increase negative

            total+=number; //acumulate total
            count++; //increase the count
            number=in.nextInt();
        }

        //calculate the average

        double average=total/count;

        //display the results
        System.out.println("The nyumber os positive is "+positive+"\n the number of negative is "+negative+"\n the total is "+total+"\n the average is "+average);
    }
}
