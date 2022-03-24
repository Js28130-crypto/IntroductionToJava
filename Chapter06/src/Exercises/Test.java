package Exercises;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        int[]ints={0,2,4,6,8,10};

        int minVal=Integer.MAX_VALUE;

        for (int i=0;i<ints.length;i++){
            if (ints[i]<minVal){
                minVal=ints[i];
            }
        }
        System.out.println("minVal: "+minVal);
        System.out.println();

        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i < ints.length; i++){
            if(ints[i] > maxVal){
                maxVal = ints[i];
            }
        }
        System.out.println("maxVal = " + maxVal);
    }
}
