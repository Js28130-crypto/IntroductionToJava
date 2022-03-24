package Examples;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        in.close();
        //prints each sequential lement in array a
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
