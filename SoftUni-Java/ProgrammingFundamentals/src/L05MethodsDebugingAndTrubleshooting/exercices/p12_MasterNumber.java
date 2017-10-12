package L05MethodsDebugingAndTrubleshooting.exercices;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;

public class p12_MasterNumber {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String inputNum = scanner.nextLine();
        for (int i = 232; i <= Integer.parseInt(inputNum); i++) {
            String toString = Integer.toString(i);
            while (Palindrome(toString) && DivisibleBy7(toString) && OneEvenDigit(toString)){
                System.out.println(i);
            }
        }
    }

    public static boolean Palindrome(String a) {

        boolean isSymmetric = true;
        int middleOfArray = a.length() / 2;
        char[] charas = a.toCharArray();
        char first = ' ';
        char second = ' ';

        for (int i = 0; i < middleOfArray; i++) {
            for (int j = a.length() - 1; j > middleOfArray; j--) {
                first = charas[i];
                second = charas[j];
                if (first != second){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean DivisibleBy7(String a) {

        boolean isDivisible = true;
        //int inputInt = Integer.parseInt(a);
        int[] array = new int[a.length()];
        //do {
        //    arrayList.add(inputInt % 10);
        //    inputInt /= 10;
        //}while (inputInt > 0);
        int sumOfAllElements = IntStream.of(array).sum();
        if (sumOfAllElements % 7 != 0) {
            return false;
        }
        return true;
    }

    public static boolean OneEvenDigit(String a) {

        boolean hasEvenDigit = true;
        int inputInt = Integer.parseInt(a);
        int element = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(inputInt);
        for (int i = 0; i < a.length() - 1; i++) {
            element = arrayList.get(i);
            if (element % 2 != 0){
                return false;
            }
        }
        return true;
    }
}