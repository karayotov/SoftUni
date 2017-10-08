package L05MethodsDebugingAndTrubleshooting.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p07PrimesInGivenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        scanner.close();
        PrimesInRangeOfNumbers(firstNum, secondNum);

    }
    public static void PrimesInRangeOfNumbers(int firstNum, int secondNum){
        List<Integer> primes = new ArrayList<>();

        for (int i = firstNum; i <= secondNum; i++) {
            boolean isPrimeNumber = true;

            for (int j = 3; j * j <= secondNum; j += 2) {
                if (i == 2 || i == 3){
                    isPrimeNumber = true;
                    break;
                }else if (i > 2 && (i & 1) == 0 || i == 0 || i == 1 || i % 2 == 0){
                    isPrimeNumber = false;
                    break;
                }
                if (i % j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber){
                primes.add(i);
            }
        }
        String s = primes.toString().replace("[", "").replace("]", "");
        System.out.printf("%s", s);
    }
}