package Course.L05MethodsDebugingAndTrubleshooting.exercices;

import java.util.Scanner;

public class p01HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readName = scanner.nextLine();

        PrintName(readName);
    }

    public static void PrintName(String name){
        System.out.printf("Hello, %s!", name);
    }
}