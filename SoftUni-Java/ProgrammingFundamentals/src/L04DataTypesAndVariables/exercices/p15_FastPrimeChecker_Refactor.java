package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p15_FastPrimeChecker_Refactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        PrimeChecker(input);
    }

    public static void PrimeChecker(int a){
        for (int i = 2; i <= a; i++)
        {    boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if  (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.printf("%d -> True%n", i);
            else System.out.printf("%d -> False%n", i);
        }
    }
}
