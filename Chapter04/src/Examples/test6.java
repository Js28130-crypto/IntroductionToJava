package Examples;

import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {

        /*int [][]array=new int[3][4];
        int count=1;
        for (int r=0;r<array.length;r++){
            for (int c=0;c<array[r].length;c++){
                System.out.print(array[r][c]=count+++" ");
            }
            System.out.println();
        }*/
        int[]array=new int[15];
        Arrays.setAll(array,p->p>9?0:p);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
