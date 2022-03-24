package Programmim;

public class Exercise_05_07 {
    public static void main(String[] args) {

        int totalCost=0; // acumulate total cost of four years tution
        int tution=10000;
        int tutionTenthYear = 0;

        for (int year=1;year<=14;year++){
            //increase tutioon by 5% every year
            tution+=(tution*0.50);

            if (year>10)// test for after 10 years
                totalCost+=tution;//acumulate tution cost

            //cost of tution in ten years
            if (year==10)
                tutionTenthYear=tution;
        }

        //display the cost of tution in ten years
        System.out.println("Tution in ten years: $"+tutionTenthYear);

        //display the cost of four years' worth of tution after tenth year
        System.out.println("Total cost for four years' worth of tution"+"after the tenth year: $"+totalCost);
    }
}
