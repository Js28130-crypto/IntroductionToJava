package Examples.Question;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        //The marks obtained by 10 Students in a subject are tabulated as follows:
        //--------------
        //--------------
        //--------------
        /*Write a program to input the names and marks of the students in the subject.
        Calculate and display:
        (a) The subject average marks (subject average marks = subject total/50).
        (b) The highest marks in the subject and the name of the student. (The maximum marks in the subject are 100.)*/
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int numberOfStudents=in.nextInt();

        String[]name=new String[numberOfStudents];
        int []marks=new int[numberOfStudents];
        int total=0;

        for (int i=0;i<name.length;i++){
            in.nextLine();
            System.out.println("Enter name of Students: "+(i+1)+": ");
            name[i]=in.nextLine();
            System.out.println("Enter marks of Students "+(i+1)+": ");
            marks[i]= in.nextInt();
            total+=marks[i];

        }
        double average=(double) total/numberOfStudents;
        System.out.println("Subject average Marks = "+average);
        int highIndex=0;

        for (int i=0;i<marks.length;i++){
            if (marks[i]>marks[highIndex]){
                highIndex=i;
            }
        }
        System.out.println("Highest Marks = "+marks[highIndex]);
        System.out.println("Name = "+name[highIndex]);

    }
}
