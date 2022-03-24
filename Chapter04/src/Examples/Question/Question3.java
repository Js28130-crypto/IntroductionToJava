package Examples.Question;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Write a program in java to store 10 numbers (including positive and negative numbers) in a single dimensional array.
        //Display all the negative numbers followed by the positive numbers without changing the order of the numbers.
        Scanner in = new Scanner(System.in);
        int []array=new int[10];

        for (int i=0;i< array.length;i++){
            array[i]=in.nextInt();
        }
        for (int i=0;i< array.length;i++){
            if (array[i]<0){
                System.out.println(array[i]+" ");
            }
        }
        for (int i=0;i< array.length;i++){
            if (array[i]>0){
                System.out.println(array[i]+" ");
            }
        }
    }
}
