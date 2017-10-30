package Course.L05MethodsDebugingAndTrubleshooting.exercices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p14_FactorialTrailingZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger input = scanner.nextBigInteger();
        char[] charArray = Factorial(input)
                .toString()
                .toCharArray();
        List<Character> reversedCharArr = new ArrayList<>();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedCharArr.add(charArray[i]);
        }
        int counterZeroes = 0;
        while (reversedCharArr.get(0).charValue() == '0'){
            counterZeroes++;
            reversedCharArr.remove(0);
        }
        System.out.println(counterZeroes);
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