package Examples.Question;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Write a program in java to store 20 temperatures in F in a single dimensional Array
        //and display all the temperatures after converting them into C
        //HINT (c/5)=(f-32)/9

        Scanner in = new Scanner(System.in);
        double []array=new double[20];

        System.out.println("Enter 20 temperatures in degree Fahrenheit");
        for (int i=0;i< array.length;i++){
            array[i]=in.nextDouble();
        }

        System.out.println("Temperatures in degree Celcius");
        for (int i=0;i< array.length;i++){
            double tc=5*((array[i]-32)/9);
            System.out.println(tc);
        }
    }
}
