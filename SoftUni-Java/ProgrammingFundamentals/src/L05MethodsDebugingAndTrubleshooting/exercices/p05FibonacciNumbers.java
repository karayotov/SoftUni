package L05MethodsDebugingAndTrubleshooting.exercices;

import java.math.BigInteger;
import java.util.Scanner;

public class p05FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNum = Integer.parseInt(scanner.nextLine());
        Fibonacci(givenNum);
    }

    public static void Fibonacci(int num){
        BigInteger prev = new BigInteger("0"), next = new BigInteger("1"), result = new BigInteger("0");

        if (num <= 1) {
            result = new BigInteger("1");
        }else{
            for (int i = 0; i < num; i++) {
                result = prev.add(next);
                prev = next;
                next = result;
            }
        }

        System.out.println(result);
    }
}