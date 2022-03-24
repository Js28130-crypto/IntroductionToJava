package Examples.Question;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort1 {
    //method implementing the bubble sort algorithm
    static void bubbleSort(int[] arr, int start, int end) {
        //outer loop interates over element of the array
        for (int i = start; i < end - 1; i++) {
            for (int j = 0; j < end - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //found the current element
                    //is greater than the next element
                    //hence do the swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }}
        //main method
        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            //given input array
            int[] arr = new int[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");

            //invoking method bubbleSort()
            bubbleSort(arr, 0, arr.length);
            System.out.println("The array after sorting is: ");
            //displaying the sorted array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

