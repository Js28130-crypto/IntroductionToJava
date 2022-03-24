package Solution;

import java.io.*;
import java.util.Scanner;

public class SolutionLeetCode {
    /*
    static int[] a= {1,0,1,1,0,1};

    public static void main(String[] args) {
        int sum = 0;
        int max  = 0 ;
        for(int i = 0 ; i< a.length ; i++){
            if(a[i] == 0){
                sum = 0;
            } else {
                sum++;
                if(sum > max)
                    max = sum;
            }
        }

        System.out.println("Max consecutive 1s is: "+max);
    }
     */
    /*
    public static void main(String[] args) {
        int list[]={1,2,3,4,5,6};
        for (int i=1;i<list.length;i++){
            list[i]=list[i-1];

            for ( i=0;i<list.length;i++){
                System.out.println(list[i]+" ");
            }
        }
    }
     */

    public static void main(String[] args) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("Output.txt"));
            writer.write("Writting to a file.");
            writer.write("Here is another file");
            writer.write("Jakup Sinaiiiiiiii");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\jakup.JS28130.000\\Desktop\\Jakup.txt"));
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
