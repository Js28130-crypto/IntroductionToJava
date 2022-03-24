package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_06_02 {
    /*
    (Reverse the numbers entered ) Write a program that reads ten integers and displays them in the reverse of the order in which they were read.
     */
    public static void bubbleSort(int[]arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int []arr=new int[10];
        for (int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        bubbleSort(arr);

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
