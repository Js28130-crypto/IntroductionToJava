package Exercise;

import java.util.Scanner;

public class DisplayPiramids {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt the user to enter an iteger from 1 to 15
        System.out.println("Enter the numner of lines: ");
        int numberOfLines=in.nextInt();

        //display pyramid
        for (int rows=1;rows<=numberOfLines;rows++){
            //create spaces in each row
            for (int space=numberOfLines-rows;space>=1;space--){
                System.out.print("  ");
            }
            //create descending numbers in each row
            for (int l=rows;l>=2;l--){
                System.out.print(l+" ");
            }
            //create ascending number in each row
            for (int r=1;r<=rows;r++){
                System.out.print(r+" ");
            }//end line
            System.out.println();
        }
    }
}
