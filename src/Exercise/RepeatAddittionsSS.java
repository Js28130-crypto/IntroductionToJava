package Exercise;

import java.util.Scanner;

public class RepeatAddittionsSS {
    public static void main(String[] args) {

        //final int REPEAT=10;

        Scanner in = new Scanner(System.in);

        int count=0;
        System.out.println("How much time you want to repeat? ");
        int numbers=in.nextInt();
        long startTime=System.currentTimeMillis();

        while (count<numbers){
            int num1=(int) (Math.random()*15)+1;

            int num2=(int)(Math.random()*15)+1;

            if (num1<num2){
                int temp=num1;
                num1=num2;
                num2=temp;
            }
            System.out.println("What is "+num1+" + "+num2+" ?");
            int answer=in.nextInt();
            if (num1+num2==answer){
                System.out.println("you are correct");
            }else
            {
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
            }
            count++;
        }
        long endTime=System.currentTimeMillis();
        long testTime=endTime-startTime;
        System.out.println("Test time is: "+testTime/1000);
    }
}
