package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p04VariableInHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexa = scanner.nextLine().substring(2);
        int decimal = Integer.parseInt(hexa, 16);
        System.out.println(decimal);
    }
}