package Course.L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p06StringAndObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        Object sequence = firstWord + " " + secondWord;

        System.out.println(sequence);
    }
}
