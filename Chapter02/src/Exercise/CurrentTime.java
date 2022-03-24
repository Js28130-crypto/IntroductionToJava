package Exercise;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        long totalMilliSecond = System.currentTimeMillis();

        long totalSeconds = totalMilliSecond / 1000;

        long currentSeconds = totalSeconds % 60;

        long totalminutes = totalSeconds / 60;

        long currentMinutes = totalminutes % 60;

        long totalHour = totalminutes / 60;

        long currentHours = totalHour % 24;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = in.nextInt();
        currentHours += offset;

        System.out.println("Current hour is: " + currentHours + " Current minutes is: " + currentMinutes + " Current seconds is: " + currentSeconds);
    }
}
