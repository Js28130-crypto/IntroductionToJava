package Exercise;

public class ConversionFromKilogramToPounds {
    public static void main(String[] args) {
        final double KILOGRAMS=  2.2;

        // 1.for loop
        /*
        * for (int i=1;i<=200;i=i+2){
            System.out.println("Kilograms\t\tPounds");
            System.out.printf("%-15d%6.1f\n",i,(i*KILOGRAMS));
        }
        * */

        //2. While loop
        /*
        * int i=1;
        while (i<200){
            System.out.println("Kilograms\t\tPounds");
            System.out.printf("%-15d%6.1f\n",i,(i*KILOGRAMS));
            i=i+2;
        }
        * */

        //3. do-while loop
        int i=1;
        do {
            System.out.println("Kilograms\t\tPounds");
            System.out.printf("%-15d%6.1f\n",i,(i*KILOGRAMS));
            i=i+2;
        }while (i<200);
    }
}
