import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        //convert the following for loop statement to a while loop and to a do-while loop:

        long sum=0;
        //int i=0;
        //1.for loop
        /*
        for (int i=0;i<=1000;i++){
            sum+=i;
        }*/

        //2.while loop
        /*

        while (i<1000){
            sum+=i;
        }*/

        //3.do-while loop
        /*
        do {
            sum+=i;
        }while (i<1000);
         */

        for (int i=1;i<10000;i++){
          sum+=i;
        }
    }
}
