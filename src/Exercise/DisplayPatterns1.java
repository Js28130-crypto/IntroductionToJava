package Exercise;

import java.util.Scanner;

public class DisplayPatterns1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*System.out.println("Enter the number of lines: ");
        int num=in.nextInt();*/


int count=0;
        for (int i=1;i<=30;i++){
         if (i==10) {
             System.out.print(++i);

         }if (i==20){
             ++i;
                System.out.println(++i);
            }
        }


        /*-------------------------------------------------------------------------------------------------------------
        * for (int i=1;i<=num;i++){

            for (int j=1;j<=2;j++){
                System.out.print("@");
                for (int k=2;k<=i;k++){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int l=1;l<=num+1;l++){
            System.out.print( "@ ");
        }*/

        /*
        * for (int i=1;i<=num;i++){
            for (int j=num-i;j>=1;j--){
                System.out.print(j);
            }
            for (int k=1;k<=i;k++){
                System.out.print("&");
            }
            System.out.println();
        }*/

        /*
        * int num=in.nextInt();

        for (int row=1;row<=num;row++){

            for (int col=num-row;col>=1;col--){

                System.out.print(" * ");
            }
            for (int i=1;i<=row;i++){
                System.out.print(i+"  ");
            }
            System.out.println();
        }   */
    }
}
