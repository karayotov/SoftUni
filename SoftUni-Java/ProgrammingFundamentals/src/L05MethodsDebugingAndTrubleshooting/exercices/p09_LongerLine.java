package L05MethodsDebugingAndTrubleshooting.exercices;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p09_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());
        scanner.close();

        double firstA = Hypotenuse(x1, y1);
        double secondA = Hypotenuse(x2, y2);
        double firstB = Hypotenuse(x3, y3);
        double secondB = Hypotenuse(x4, y4);

        double lengthA = Hypotenuse(firstA, secondA);
        double lengthB = Hypotenuse(firstB, secondB);


        if (lengthA >= lengthB){
            if (firstA <= secondA){
                PrintResult(x1, y1, x2, y2);
            }else {
                PrintResult(x2, y2, x1, y1);
            }
        }else {
            if (firstB <= secondB){
                PrintResult(x3, y3, x4, y4);
            }else {
                PrintResult(x4, y4, x3, y3);
            }
        }

    }

    public static double Hypotenuse(double x, double y) {
        double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return length;
    }
    public static void PrintResult(double a, double b, double c, double d){
        DecimalFormat decimalFormat = new DecimalFormat("#.#########");

        System.out.printf("(%s, %s)(%s, %s)", decimalFormat.format(a), decimalFormat.format(b)
                , decimalFormat.format(c), decimalFormat.format(d));
    }
}