package Examples.Question;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Write a program in java to store 20 numbers (even and odd numbers) in a single dimensional Array(SDA).
        //calculate and display the sum of all even numbers and all odd numbers separately.
        Scanner in = new Scanner(System.in);
        int []array=new int[20];

        for (int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        int oddSum=0;
        int evenSum=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                evenSum+=array[i];
            }else {
                oddSum+=array[i];
            }
        }
        System.out.println("Sum of Odd numbers = "+oddSum);
        System.out.println("Sum of Even numbers = "+evenSum);
    }
}
