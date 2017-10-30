package Course.L05MethodsDebugingAndTrubleshooting.exercices;


import java.util.Scanner;

public class p12_MasterNumber {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String inputNum = scanner.nextLine();
        for (int i = 232; i < Integer.parseInt(inputNum); i++) {
            String toString = Integer.toString(i);
            if (Palindrome(toString) && DivisibleBy7(toString) && OneEvenDigit(toString)){
                System.out.println(i);
            }
        }
    }

    public static boolean Palindrome(String a) {
        return a.equals(new StringBuilder(a)
                .reverse()
                .toString());
    }

    public static boolean DivisibleBy7(String a) {
        int num = Integer.parseInt(a);
        int sum  = 0;
        while (num > 0){
            sum = sum + num % 10;
            num /= 10;
        }
        if (sum % 7 != 0) {
            return false;
        }
        return true;
    }

    public static boolean OneEvenDigit(String a) {
        int num = Integer.parseInt(a);
        int sum  = 0;
        while (num > 0){
            sum = num % 10;
            num /= 10;
            if (sum % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}