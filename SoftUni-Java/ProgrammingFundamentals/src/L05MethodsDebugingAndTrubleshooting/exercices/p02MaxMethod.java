package L05MethodsDebugingAndTrubleshooting.exercices;

import java.util.Scanner;

public class p02MaxMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int maxOfFirstTwo = 0;

        maxOfFirstTwo = GetMax(firstNum, secondNum);
        max = GetMax(maxOfFirstTwo, thirdNum);
        System.out.println(max);

    }
    static int GetMax(int a, int b){
        int max = Math.max(a, b);

        return max;
    }
}
