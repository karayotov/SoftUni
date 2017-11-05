package ExamPrepare.oldExams.Exam26February2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01_HornetWings {
    public static void main(String[] args) throws IOException {
        BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //You will be given N – an integer indicating the wing flaps, a contestant has chosen to do.
        int n = Integer.parseInt(bufferedReader.readLine());
        //After that, you will receive M – a floating-point number indicating the distance,
        // in meters, the hornet travels for 1000 wing flaps.
        double m = Double.parseDouble(bufferedReader.readLine());
        //Then you will receive P – an integer indicating the endurance of the contestant,
        // or how many wing flaps he can make, before he stops to take a break and rest. A hornet rests for 5 seconds.
        int p = Integer.parseInt(bufferedReader.readLine());

        //A hornet rests for 5 seconds
        int rest = 5;

        double distance = 0;
        distance = n * (m * 0.001);

        System.out.printf("%.2f m.", distance);
        System.out.println();

        long timeInSeconds = 0;

        long timeWithoutBreak = (n / 100);
        long breaksTime = (n / p) * 5;
        timeInSeconds =  timeWithoutBreak + breaksTime;

        System.out.printf("%d s.", timeInSeconds);
    }
}
