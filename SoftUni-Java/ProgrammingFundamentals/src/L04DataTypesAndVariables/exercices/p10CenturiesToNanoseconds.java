package L04DataTypesAndVariables.exercices;

import java.math.BigDecimal;
import java.util.Scanner;

public class p10CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        CenturiesToNanoSeconds(centuries);

    }
    public static void CenturiesToNanoSeconds(int centuries){

        long years = centuries * 100;
        long days = (long) (years * 365.2422);
        BigDecimal hours = new BigDecimal(days * 24);

        BigDecimal minutes = hours.multiply(new BigDecimal(60));
        BigDecimal seconds = minutes.multiply(new BigDecimal(60));
        BigDecimal milliseconds = seconds.multiply(new BigDecimal(1000));
        BigDecimal microseconds = milliseconds.multiply(new BigDecimal(1000));
        BigDecimal nanoseconds = microseconds.multiply(new BigDecimal(1000));

        System.out.printf("%d centuries = %d years = %d days = %s hours = %s minutes = %s seconds " +
                "= %s milliseconds = %s microseconds = %s nanoseconds", centuries, years, days, hours,
                minutes, seconds, milliseconds, microseconds, nanoseconds);
    }
}
