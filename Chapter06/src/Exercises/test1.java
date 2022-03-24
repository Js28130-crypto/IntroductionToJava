package Exercises;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int originalLength=100;
        int newLength=15;
        int[]ids=new int[originalLength];

        //do some processing here....

        //create a temporary array of new length
        int[]tempIds=new int[newLength];

        //while copying array elements we have to check if the new length
        //is less than or greater than original length
        int elementsCopy=originalLength>newLength?newLength:originalLength;

        //copy the elements from the original array to the new array
        for (int i=0;i<elementsCopy;i++){
            tempIds[i]=ids[i];
        }

        //finally assign the reference of new array to ids
        ids=tempIds;
        System.out.println(Arrays.toString(ids));
    }
}
