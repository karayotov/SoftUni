package Course.L05MethodsDebugingAndTrubleshooting.exercices;


import java.text.DecimalFormat;
import java.util.Scanner;

public class p11_GeometryCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String figure = scanner.nextLine().toLowerCase();
        double side = Double.parseDouble(scanner.nextLine());

        switch (figure){
            case "triangle":
                side = RectangleArea(side) / 2;
                break;
            case "rectangle":
                side = RectangleArea(side);
                break;
            case "square":
                side = SquareArea(side);
                break;
            case "circle":
                side = SquareArea(side) * Math.PI;
                break;
                default:
                    break;
        }
        System.out.printf("%s", decimalFormat.format(side));
    }

    public static double RectangleArea(double side){
        double secondInput = Double.parseDouble(scanner.nextLine());
        return side * secondInput;
    }

    public static double SquareArea (double side){
        return Math.pow(side, 2);
    }
}