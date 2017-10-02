package L05MethodsDebugingAndTrubleshooting.lab.l01DeclaringAndInvokingMethods;

import java.util.Scanner;

public class p02SignOfIntegerNumber {
//        int n = Integer.parseInt(scanner.nextLine());
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    PrintSign(num);

}
    static void PrintSign(int num){

        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        }else if (num < 0){
            System.out.printf("The number %d is negative.", num);
        }else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}