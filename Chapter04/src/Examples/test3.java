package Examples;

import java.util.Arrays;

public class test3 {
   /* public static void main(String[] args) {
        int [][]cubes={{1,1},{2,4},{3,9},{4,16}};
        System.out.println(Arrays.deepToString(cubes));
    }*/

    String [] array;
    String delimeter;

    public static String arrayToString(String[] array,String delimeter){
        String result="";
        if (array.length>0){
            StringBuilder sb=new StringBuilder();

            for (String s:array){
                sb.append(s).append(delimeter);
            }
            result=sb.deleteCharAt(sb.length()-1).toString();
        }
        return result;
    }

    public static void main(String[] args) {
        String []currencies={"USD","INR","AUD","GBP"};
        System.out.println("array is : "+Arrays.toString(currencies));
        //array to comma seperated String
        String output=arrayToString(currencies,",");
        System.out.println("CSV string: "+output);

        //array to colon seperated String
        output=arrayToString(currencies,":");
        System.out.println("colon string: "+output);
    }
}
