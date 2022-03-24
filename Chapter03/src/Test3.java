import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //shembulli 1
        /*
        System.out.println("Enter a number: ");
        int num1=in.nextInt();
        System.out.println("Enter a number: ");
        int num2=in.nextInt();
        System.out.println("Enter a number: ");
        int num3=in.nextInt();
        System.out.println((num1<num2&num2<num3)?"sorted":"not sorted");*/

        //shembulli 2
        /*
        System.out.println("Enter your age: ");
        int age=in.nextInt();

        System.out.println((age>=16)?"ticketPrice=20":"ticketPrice=10");
        */

        //shembulli 3
        /*
        System.out.println("Count");
        int count=in.nextInt();
        System.out.println((count%10==0)?"\ns\n":count);*/

        //shembulli 4 (A)
        /*
        System.out.println("X: ");
        int x = in.nextInt();
        System.out.println("Scale: ");
        int scale = in.nextInt();

        int score;
        if (x > 10) {
            System.out.println(score = 3 * scale);
        } else {
            System.out.println(score = 4 * scale);
        }*/

        //Shembulli 4   (B)
        /*
        System.out.println("Income: ");
        int income=in.nextInt();
        if (income>10000){
            System.out.println(income*0.2);
        }else {
            System.out.println(income*0.17+1000);
        }*/
        System.out.println((char)Math.random());
    }
}
