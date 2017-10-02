package L05MethodsDebugingAndTrubleshooting.lab.l01DeclaringAndInvokingMethods;

import java.util.Scanner;

public class p03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int middle = 2;
        int max = input * 2 - 1;
        for (int i = 1; i <= max; i++) {
            if (middle <= input){

                TriangleWithNumSupport(counter);
                counter++;
                middle++;
            }else {

                TriangleWithNumSupport(counter);
                counter--;
            }
        }
    }
    static void TriangleWithNumSupport(int counter){

        for (int j = 1; j <= counter; j++) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }
}
