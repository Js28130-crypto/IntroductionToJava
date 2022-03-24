import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int n1=in.nextInt();
        System.out.println("Enter second integer: ");
        int n2=in.nextInt();

        int gcd=n1<n2?n1:n2;

        while (n1%gcd!=0||n2%gcd!=0){
            gcd--;
        }
        System.out.println("The greatest common divisor for "+n1+" and "+n2+" is "+gcd);

    }
}
