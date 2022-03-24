import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //what are the difference between while loop and do-while loop
        //while loop
        /*
        int sum=0;
        System.out.println("Enter an integer "+"(the input ends if it is 0)");
        int num=in.nextInt();
        while (num!=0){
            sum+=num;
            System.out.println("Enter an integer "+"(the input ends if it is 0)");
            num= in.nextInt();
        }*/

        //do-while loop

        /*
        * int sum=0;
        System.out.println("Enter an integer "+"(the input ends if it is 0)");
        int num=in.nextInt();
        do {
            sum+=num;
            System.out.println("Enter an integer "+"(the input ends if it is 0)");
            num=in.nextInt();
        }while (num!=0);*/

        /*for (int i=0,j=0;(i+j<10);i++,j++){
            System.out.println(i);
            System.out.println(j);*/
        /*
        int sum=0;
        for (int i=0;i<10;i++){
            System.out.println(i);
            sum+=i;
            System.out.println(sum);
        }*/

        /*int sum=0;
        for (int i=0;i<10;++i){
            sum=sum+i;
            System.out.println(sum);
        }*/
    }
}
