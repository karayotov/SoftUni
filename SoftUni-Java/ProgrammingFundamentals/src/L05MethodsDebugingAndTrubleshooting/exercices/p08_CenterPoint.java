package L05MethodsDebugingAndTrubleshooting.exercices;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p08_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = Double.parseDouble(scanner.nextLine());
        double a2 = Double.parseDouble(scanner.nextLine());
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        scanner.close();

        double lengthA = CenterPoint(a1, a1);
        double lengthB = CenterPoint(b1, b2);

        List<String> distance = new ArrayList<>();

        if (lengthA <= lengthB){
            distance.add(ToString(a1));
            distance.add(ToString(a2));
        }else {
            distance.add(ToString(b1));
            distance.add(ToString(b2));
        }
        System.out.println("(" + String.join(", ", distance) + ")");

    }
    public static double CenterPoint(double x, double y) {
        double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    return length;
    }

    public static String ToString(Double a){
        DecimalFormat decimalFormat = new DecimalFormat("#.###########");
        String s = decimalFormat.format(a);
        return s;
    }
}