package Exercises;

import java.util.Scanner;

public class Exercise_06_01 {
    /*
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is >= best - 10;
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:
*/
    //method max return the is highest score
    public static int max(int[]array){
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    //method getGrades assigns grades based on granding scheme
    public static void getGrades(int[]scores,char[]grades){
        int best=max(scores);
        for (int i=0;i<scores.length;i++){
            if (scores[i]>=best-10){
                grades[i]='A';}
                else if (scores[i]>=best-20){
                    grades[i]='B';}
                else if (scores[i]>=best-30){
                    grades[i]='C';
            }else if (scores[i]>=best-40){
                    grades[i]='D';
            }else {
                    grades[i]='F';
            }
        }
    }
    //main method
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //prompt the user to enter the total number of students
        System.out.println("Enter the number of students: ");
        int[]scores=new int[in.nextInt()];
        char[]grades=new char[scores.length];

        //promp the user to enter all the scores
        System.out.println("Enter "+scores.length+" scores: ");
        for (int i=0;i<scores.length;i++){
            scores[i]=in.nextInt();
        }

        //get grades
        getGrades(scores,grades);

        //display result
        for (int i=0;i<scores.length;i++){
            System.out.println("Student: "+i+" score is "+scores[i]+" and grade is "+grades[i]);
        }
    }
}
