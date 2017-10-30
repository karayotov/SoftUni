package Course.L05MethodsDebugingAndTrubleshooting.exercices;

import java.util.Scanner;

public class p06_PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        if (PrimeChecker(input)){
            System.out.printf("True");
        }else {
            System.out.printf("False");
        }
    }
    public static boolean PrimeChecker(long i){

        if (i > 2 && (i & 1) == 0 || i == 0 || i == 1 || i % 2 == 0) return false;

        for (int j = 3; j <= Math.sqrt(i) ; j+= 2) {
            if (i % j == 0) return false;
            if (j % 2 == 0) return false;
        }
        return true;

        //long factors = 0;
        //long j = 1;
//
        //while (j <= i){
        //    if (i % j == 0){
        //        factors++;
        //    }
        //    j++;
        //}
        //return (factors == 2);
    }
}