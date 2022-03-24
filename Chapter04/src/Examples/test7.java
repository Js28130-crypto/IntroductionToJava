package Examples;

public class test7 {
    /*public static void main(String[] args) {
        int number=0;
        int[]numbers=new int[1];
        m(number,numbers);
        System.out.println("number is "+number+" and numbers[0] is "+numbers[0]);
    }
    public static void m(int x,int[] y){
        x=3;
        y[0]=3;
    }*/
    public static void main(String[] args) {
        int[]values={2,5,4,6,8,10,4,5};
        int tota=0;
        //      a)
        /*for (int i=0;i<values.length;i=i+1){
            tota+=values[i];
        }*/

        //      b)
        for (int i=1;i<values.length;i=i+2){
            tota+=values[i];
        }
        System.out.println(tota);
    }
}
