package ExamPractise.Programming_Fundamentals_Exam_26_February_2017_Part_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class p01_resurrection {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int phoenixesAmount = Integer.parseInt(bufferedReader.readLine());
        long bodyLength, oneWingLength;
        float bodyWidth;
        float totalYears;
        for (int i = 0; i < phoenixesAmount; i++) {

            bodyLength = Long.parseLong(bufferedReader.readLine());
            bodyWidth = Float.parseFloat(bufferedReader.readLine());
            oneWingLength = Long.parseLong(bufferedReader.readLine());

            //totalYears = {totalLength} ^ 2 * ({totalWidth} + 2 * {wingLength});

            totalYears = (long)Math.pow(bodyLength, 2) * (bodyWidth + 2 * oneWingLength);

            System.out.println(totalYears);
        }
    }
}
