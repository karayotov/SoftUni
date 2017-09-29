package L04DataTypesAndVariables.lab;

import java.util.Scanner;

public class p05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n > 9){
                while (sum > 0){
                    sum += i % 10;
                    i = i / 10;
                }
            }
            boolean isSpecial = (sum == 5 || sum == 7|| sum == 11);
            System.out.println(isSpecial);
        }
    }
}