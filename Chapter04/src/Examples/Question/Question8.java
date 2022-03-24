package Examples.Question;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        /*Write a program to accept a list of 20 integers. Sort the first number in ascending order
        * and next the 10 numbers in desecnding ordet by using 'Bubble Sort tehnicue.
        * Finally print the complet list of integers*/
        Scanner in =new Scanner(System.in);
        int arr[]=new int[20];
        System.out.println("Enter 20 numbers: ");

        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        //sort first half in ascending order
        for (int i=0;i<arr.length/2-1;i++){
            for (int j=0;j< arr.length/2-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        //sort second half in descending order
        for (int i=0;i<arr.length/2-1;i++){
            for (int j=arr.length/2;j< arr.length-i-1;j++){
                if (arr[j]<arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        //print the final sorted array
        System.out.println("\nSorted Array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
