package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p09ReverseChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        ReversChars(firstChar, secondChar, thirdChar);
    }

    public static void ReversChars(char a, char b, char c) {
        System.out.printf("%s%s%s", c, b, a);
    }
}
