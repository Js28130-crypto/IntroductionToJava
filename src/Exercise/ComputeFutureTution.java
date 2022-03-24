package Exercise;

public class ComputeFutureTution {
    public static void main(String[] args) {
        double tution = 10000;
        double tutionCost = 0;
        double tutionCostTenthYear = 0;

        for (int i = 0; i <= 14; i++) {
            tution = tution + (tution * 0.05);

            if (i > 10) {
                tutionCost = tutionCost + tution;
            }
            if (i == 10) {
                tutionCostTenthYear = tution;
            }
        }
        System.out.println("Tution in ten years: "+tutionCostTenthYear);
        System.out.println("total cost for four years worth of tution \n after the tenth year: "+tutionCost);
    }
}
