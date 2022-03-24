package Exercises;

import java.util.Scanner;

public class Exercise_06_05 {
    /*
(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers.
*/

    //method isDistinct returns true if number is not in array false otherwise
    public static boolean isDistinct(int[] array,int num){
        for (int i=0;i<array.length;i++){
            if (num==array[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[]distinctNumbers=new int[10];       //Array of length 10
        int num;        //user input;
        int count=0;        //Number of distinct numbers

        //prompt the user to enter ten numbers
        for (int i=0;i<10;i++){
            num=in.nextInt();

            //test if num is distinct
            if (isDistinct(distinctNumbers,num)){
                distinctNumbers[count]=num;
                count++;
            }
        }

        //display the number of distinct numbers and the
        //distinct numbers seperated by exactly one space
        System.out.println("The number of distinct number is "+count);
        System.out.println("The distinct numbers are");
        for (int i=0;i<distinctNumbers.length;i++){
            if (distinctNumbers[i]>0){
                System.out.println(" "+distinctNumbers[i]);
            }
            System.out.println();
        }

    }
}
