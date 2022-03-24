package Examples.Question;

import java.awt.*;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Write a program to accept name and total marks of N number of Students in two single subscript
        //arrays name[] and totalmarks[].
        //calculate and print:
        //-1 the average of the total marks obtained by N number of students.
        //[average=(sum of total marks of all the students)/n]
        //-2 deviation of each student's total marks with the average.
        //[deviation=total marks of a student - average]

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents = in.nextInt();

        String[] name = new String[numberOfStudents];
        int[] totalMark = new int [numberOfStudents];
        int grandTotal = 0;

        for (int i=0;i<numberOfStudents;i++){
            in.nextLine();
            System.out.println("Enter name of Student "+(i+1)+": ");
            name[i]=in.nextLine();
            System.out.println("Enter total marks of student "+(i+1)+": ");
            totalMark[i]=in.nextInt();
            grandTotal+=totalMark[i];
        }
        double average=grandTotal/(double)numberOfStudents;
        System.out.println("Average = "+average);

        for (int i=0;i<numberOfStudents;i++){
            System.out.println("Deviation for "+name[i]+" = "+(totalMark[i]-average));
        }
    }
}
