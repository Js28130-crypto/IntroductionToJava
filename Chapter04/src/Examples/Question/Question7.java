package Examples.Question;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //write a program in java using arrays:
        /*(a) To store the Roll No., Name and marks in six subjects for 100 students.
(b) Calculate the percentage of marks obtained by each candidate. The maximum marks in each subject are 100.
(c) Calculate the Grade as per the given criteria:

Percentage Marks	Grade
From 80 to 100	A
From 60 to 79	B
From 40 to 59	C
Less than 40	D*/
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int numberOfStudents=in.nextInt();

        int[] rollNo=new int[numberOfStudents];
        String[] name=new String[numberOfStudents];

        int[]marks=new int[numberOfStudents];
        int total=0;

        char[]grades=new char[numberOfStudents];
        for (int i=0;i<numberOfStudents;i++){
            in.nextLine();
            System.out.println("Enter student "+(i+1)+" details:");

            System.out.print("Name: ");
            name[i]=in.nextLine();
            System.out.print("Roll No: ");
            rollNo[i]=in.nextInt();
            int[] subject=new int[6];
            for (int j=0;j<subject.length;j++){
                System.out.print("Subject "+(j+1)+" Marks: ");
                marks[i]=in.nextInt();
                total+=marks[i];
                if (marks[i]<40){
                    grades[i]='D';
                }else if (marks[i]<60){
                    grades[i]='C';
                }else if (marks[i]<80){
                    grades[i]='B';
                }else{
                    grades[i]='A';
                }
            }
            System.out.println();
            double average=(double) total/subject.length;
            System.out.println("Average is: "+average);

            for (int j=0;j<numberOfStudents;j++){
                System.out.println(rollNo[i]+"\t"+name[i]+"\t"+marks[i]+"\t"+grades[i]);
            }

        }
    }
}
