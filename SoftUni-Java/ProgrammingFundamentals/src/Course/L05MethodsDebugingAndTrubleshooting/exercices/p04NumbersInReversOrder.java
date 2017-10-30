package Course.L05MethodsDebugingAndTrubleshooting.exercices;

import java.util.Scanner;

public class p04NumbersInReversOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String givenString = scanner.nextLine();

        ReversOrderString(givenString);
    }

    public static void ReversOrderString(String revers){

        int lengthOfString = revers.length();

        for (int i = 0; i < lengthOfString; i++) {

            String lastString = revers.substring(revers.length() - 1);
            revers = revers.substring(0, revers.length() -1);
            System.out.printf("%s", lastString);

        }
    }
}