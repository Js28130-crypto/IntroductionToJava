package Exercises;

import java.util.Scanner;

public class Exercise_06_09 {
    /*
    (Find the smallest element) Write a method that finds the smallest element in an
    array of double values using the following header:
    public static double min(double[] array)
    Write a test program that prompts the user to enter ten numbers, invokes this
    method to return the minimum value, and displays the minimum value.
     */

    //method min returns the smallest element in an array of double values
    public static double min(double []array){
        double min=array[0];
        for (double i: array){
            if (i<min){
                min=i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //create a scanner
        double[]numbers=new double[10];     //create a array length 10

        //prompt the user to enter the number
        for (int i=0;i< numbers.length;i++){
            numbers[i]=in.nextDouble();
        }
        //display the minimum value
        System.out.println("The minimum value is: "+min(numbers));

    }
}
