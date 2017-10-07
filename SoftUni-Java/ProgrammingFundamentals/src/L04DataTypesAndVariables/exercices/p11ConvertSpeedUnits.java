package L04DataTypesAndVariables.exercices;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class p11ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float distanceInMeters = Float.parseFloat(scanner.nextLine());
        float hours = Float.parseFloat(scanner.nextLine());
        float minutes = Float.parseFloat(scanner.nextLine());
        float seconds = Float.parseFloat(scanner.nextLine());

        SpeedConverter(distanceInMeters, hours, minutes, seconds);
    }
    public static void SpeedConverter(float dm, float h, float m, float s){

        DecimalFormat df = new DecimalFormat("#.#######");
        df.setRoundingMode(RoundingMode.HALF_UP);

        float inSeconds = h * 3600f + m * 60f + s;

        float metersPerSecond = dm / inSeconds;
        float kilometersPerHour = (dm / 1000f) / (inSeconds / 3600f);
        float milesPerHour = (dm / 1609f) / (inSeconds / 3600f);

        String mPerSecondsString = Float.toString(metersPerSecond);
        String kmPerHoursString = Float.toString(kilometersPerHour);
        String milesPerHoursString = Float.toString(milesPerHour);


        //System.out.println(mPerSecondsString.substring(0, Math.min(mPerSecondsString.length(), 8)));
        //System.out.println(kmPerHoursString.substring(0, Math.min(kmPerHoursString.length(), 8)));
        //System.out.println(milesPerHoursString.substring(0, Math.min(milesPerHoursString.length(), 8)));
        //System.out.println();
//
        //System.out.println(df.format(metersPerSecond));
        //System.out.println(df.format(kilometersPerHour));
        //System.out.println(df.format(milesPerHour));
        //System.out.println();

        //System.out.printf("%f%n", metersPerSecond);
        //System.out.printf("%f%n", kilometersPerHour);
        //System.out.printf("%f", milesPerHour);
    }
}