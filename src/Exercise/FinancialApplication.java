package Exercise;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            method1(i, 3);
            i++;
        }
    }
    public static void method1(
            int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
    }

