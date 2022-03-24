package ProgrammingExercise;

import java.util.Scanner;

public class FindTheNumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Month: ");
        int month = in.nextInt();
        System.out.println("Year: ");
        int year = in.nextInt();
        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println("that "+month+year+" had "+days+" days");
                break;
            case 4:case 6: case 9: case 11:
                days=30;
                System.out.println("that "+month+year+" had "+days+" days");
                break;
            case 2:
                if (((year%4==0)&&(year%100==0))||(year%400==0)){
                    days=29;
                System.out.println("that "+month+year+" had "+days+" days");}
                else{
                    days=28;
                System.out.println("that "+month+year+" had "+days+" days");}
                break;
            default:
                System.out.println("Erorrrrrr!!!!!!!!!!!!!");
                break;
        }
        System.out.println("");
    }
}
