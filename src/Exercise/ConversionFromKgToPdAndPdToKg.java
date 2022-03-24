package Exercise;

public class ConversionFromKgToPdAndPdToKg {
    public static void main(String[] args) {
        final double KILOGRAM = 2.2;
        final double POUND = 0.453;

        for (int i = 1; i < 200; i = i + 2) {
            System.out.println("Kilograms" + "Pounds");
            System.out.printf("%-15d%6.1f\n", i, (i * KILOGRAM));
        }

        for (int i = 1; i < 200; i = i + 2) {
            System.out.println("Pounds");
            System.out.printf("%-15d%6.1f\n", i, (i * POUND));
        }

    }
}
