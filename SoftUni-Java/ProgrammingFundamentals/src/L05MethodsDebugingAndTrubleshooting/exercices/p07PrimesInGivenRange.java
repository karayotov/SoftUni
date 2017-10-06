package L05MethodsDebugingAndTrubleshooting.exercices;

import java.util.Scanner;

public class p07PrimesInGivenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        PrimeDigitsOfRange(firstNum, secondNum);

    }
    public static void PrimeDigitsOfRange(int startInput, int endInput) {
        //int divider = ;
        for (int i = startInput; i < endInput; i++) {
            if (i % i == 0){
                System.out.printf("%d", i);
            }
        }
    }
}
