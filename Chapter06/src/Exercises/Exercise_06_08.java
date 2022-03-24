package Exercises;

import java.util.Scanner;

public class Exercise_06_08 {
    /************************************************************************************
     * (Average an array) Write two overloaded methods that return the average of an     *
     * array with the following headers:                                                 *
     * public static int average(int[] array)                                            *
     * public static double average(double[] array)                                      *
     * Write a test program that prompts the user to enter ten double values, invokes    *
     * this method, and displays the average value.                                      *
     *************************************************************************************/

    //overloaded mmethod average accepts an integer array nad returns its average
    public static int average(int[]array){
        int average=0;
        for (int i:array){
            average+=i; }    //add indexed value to average
            return average/array.length;
    }

    //oerloaded method averages accepts an double array and returns its average
    public static double average(double[]array){
        double average=0;
        for (double i:array){
            average+=i;//add indexed value to average
        }
        return average/ array.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[]values=new double[10];      //array of length 10

        //prompt the user to enter ten double values

        System.out.println("Enter ten values of double type: ");
        for (int i=0;i<values.length;i++){
            values[i]=in.nextDouble();
        }

        //displaying the average value
        System.out.println("The average value: "+average(values));
    }
}
