package Examples;

public class testtt {
    /*public static void printArray(int[]array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{3,1,2,6,4,2});
    }*/
   /* public static void main(String[] args) {
        int number=0;
        int[]numbers=new int[1];
        m(number,numbers);
        System.out.println("number is: "+number+" and numbers[0] is "+numbers[0]);
    }
    public static void m(int x,int[]y){
        x=3;
        y[0]=3;
    }*/
    public static int linearSearch(int[]list,int key){
        for (int i=0;i<list.length;i++){
            if (key==list[i]){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[]list={1,4,4,2,5,-3,6,2};
        int i=linearSearch(list,4);
        int j=linearSearch(list,-4);
        int k=linearSearch(list,-3);
        System.out.println(i+"\n"+j+"\n"+k);
    }

}
