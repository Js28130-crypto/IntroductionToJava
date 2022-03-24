package Exercise;

import java.util.Scanner;

public class ConversionsMilesToKilometers {
    public static void main(String[] args) {
        final double MILES_TO_KILOMETERS=1.609;
int i=1;
        //for loop
        /*
        for (int i=1;i<=10;i++){
            System.out.println("Miles\t\t\t\tKilometers");
            System.out.println(i+"\t\t\t\t\t"+(i*MILES_TO_KILOMETERS));
        }
        */

        //while loop
       /*
        while (i<=10){
            System.out.println("Miles\t\t\t\tKilometers");
            System.out.println(i+"\t\t\t\t\t"+(i*MILES_TO_KILOMETERS));
            i++;
        }
        */

        //do-while loop

        do {
            System.out.println("Miles\t\t\t\tKilometers");
            System.out.println(i+"\t\t\t\t\t"+(i*MILES_TO_KILOMETERS));
            i++;
        }while (i<=10);
    }
}
