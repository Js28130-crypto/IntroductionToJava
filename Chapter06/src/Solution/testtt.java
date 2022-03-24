package Solution;

import java.util.Scanner;

public class testtt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first=in.nextInt();
        int second=in.nextInt();
        int third=in.nextInt();

        int largest=largestOfThree(first,second,third);
        System.out.printf("Largest of three numbers, between %d, %d, and %d is %d %n",first,second,third,largest);

        int greatest=greatestOfThreeUsingTernanryOperator(first,second,third);
        System.out.printf("Greatest of three numbers in java using ternary operator is %d %n",greatest);
        in.close();
    }
    public static int largestOfThree(int first,int second,int third){
        if (first>second&&first>third){
            return first;
        }else if (second>first&&second>third){
            return second;
        }else if (third>first&&third>second){
            return third;
        }
        return Integer.MIN_VALUE;
    }

    public static int greatestOfThreeUsingTernanryOperator(int one,int two,int three){
        return (one>two)?(one>three ?one: three):(two>three?two:three);
    }
}
