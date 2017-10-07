package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p14_IntToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        NumberFormatsConverter(input);
    }

    public static void NumberFormatsConverter(long a){
        String binary = Long.toBinaryString(a);
        String hexadecimal = Long.toHexString(a).toUpperCase();

        System.out.println(hexadecimal);
        System.out.println(binary);
    }
}