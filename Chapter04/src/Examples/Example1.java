package Examples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        double[] num = new double[5];
        num[0] = 1;
        num[1] = 5;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        num[5] = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + num.length + " values");
      /*  for (int i=0;i<num.length;i++){
            num[i]=in.nextDouble();
        }*/
        /*double total=0;
        for (int i=0;i<num.length;i++){
            System.out.println((num[i]=Math.random()*100)+" ---");

            total+=num[i];
            System.out.println(total);
        }*/
        /*double max=num[0];
        for (int i=1;i<num.length;i++){
            System.out.println((num[i]=Math.random()*100)+" ---");
            if (num[i]>max){
                max=num[i];
            }
            System.out.println(max+" maxxxx");
        }*/




    }
}
