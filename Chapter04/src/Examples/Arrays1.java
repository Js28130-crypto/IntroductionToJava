package Examples;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        //take 10 integers inputs from user and store them in an array. Again ask user to gibe a number.
        //now, tell user whether that number is present in array or not
        Scanner in = new Scanner(System.in);
        int[]array=new int[10];

        for (int i=0;i<=array.length;i++){
            System.out.println("Print the value of array["+i+"]");
            array[i]= in.nextInt();
        }
        for (int i=0;i<array.length;i++){
            System.out.println("the value of array["+i+"] is "+array[i]);
        }
    }
}
