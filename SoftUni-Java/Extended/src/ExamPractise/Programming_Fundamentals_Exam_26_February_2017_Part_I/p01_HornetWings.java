package ExamPractise.Programming_Fundamentals_Exam_26_February_2017_Part_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class p01_HornetWings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Wing flaps todo
        BigInteger n = new BigInteger(bufferedReader.readLine());
        //distance in meters for 1000 Wing flaps
        BigDecimal m = new BigDecimal(bufferedReader.readLine());
        //Wing flaps before without break
        BigInteger p = new BigInteger(bufferedReader.readLine());

        BigDecimal flapsPerSecond  = new BigDecimal("100");
        BigDecimal distancePerMeter = m.divide(BigDecimal.valueOf(1000));

    }
}
