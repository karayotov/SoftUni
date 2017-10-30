package Course.L05MethodsDebugingAndTrubleshooting.exercices;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p10_CubeProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  side = Double.parseDouble(scanner.nextLine());
        String method = scanner.nextLine();
        scanner.close();

        FormulaType(method, side);


    }

    public static double FaceDiagonals(double s) {
        double face = Math.sqrt(2.0 * Math.pow(s, 2));
        return face;
    }

    public  static double SpaceDiagonals(double s){
        double space = Math.sqrt(3.0 * Math.pow(s, 2));
        return space;
    }

    public static double Volume(double s){
        double volume = Math.pow(s, 3);
        return volume;
    }

    public static double Area(double s){
        double area = 6.0 * Math.pow(s, 2);
        return area;
    }

    public static void FormulaType(String a, double side){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        switch (a){
            case "face":
                System.out.println(decimalFormat.format(FaceDiagonals(side)));
                break;
            case "space":
                System.out.println(decimalFormat.format(SpaceDiagonals(side)));
                break;
            case "volume":
                System.out.println(decimalFormat.format(Volume(side)));
                break;
            case "area":
                System.out.println(decimalFormat.format(Area(side)));
                break;
            default:
                break;
        }
    }
}
