package L04DataTypesAndVariables.exercices;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p12RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        CalculationsOfRectangle(width, height);
    }

    public static void CalculationsOfRectangle(double w, double h){
        double perimeter = 2.0 * (w + h);
        double area = w * h;
        double diagonal = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));

        DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        System.out.println(decimalFormat.format(perimeter));
        System.out.println(decimalFormat.format(area));
        System.out.println(decimalFormat.format(diagonal));

    }
}
