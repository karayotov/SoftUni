package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p17_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startChar = Integer.parseInt(scanner.nextLine());
        int endChar = Integer.parseInt(scanner.nextLine());

        for (char i = (char) startChar; i <= endChar; i++) {
            System.out.printf("%s ", i);
        }
    }
}