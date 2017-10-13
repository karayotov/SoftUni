package L05MethodsDebugingAndTrubleshooting.exercices;

import java.math.BigInteger;
import java.util.Scanner;

public class p13_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger input = scanner.nextBigInteger();
        System.out.println(Factorial(input));
        
    }

    public static BigInteger Factorial(BigInteger n){
        BigInteger factorial = BigInteger.valueOf(1);
        if (n.equals(BigInteger.valueOf(0))){
            return factorial;
        }
        for (int i = 1; i <= n.intValue(); i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
