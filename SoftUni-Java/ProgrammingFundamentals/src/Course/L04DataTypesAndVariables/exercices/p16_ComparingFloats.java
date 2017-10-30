package Course.L04DataTypesAndVariables.exercices;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p16_ComparingFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        ComparingFloats(firstNum, secondNum);

    }
    public static void ComparingFloats(double a, double b){

        a = Math.abs(a);
        b = Math.abs(b);
        DecimalFormat decimalFormat = new DecimalFormat("#.00000000");
        String givenNumberA = decimalFormat.format(a);
        String givenNumberB = decimalFormat.format(b);

        char[] aArr = givenNumberA.toCharArray();
        char[] bArr = givenNumberB.toCharArray();

        int length = Math.min(aArr.length, bArr.length);
        int counterToDot = 0;
        int counterAfterDot = 0;

        for (int i = 0; i < length; i++) {
            if (aArr[i] == bArr[i]){
                counterToDot++;
                if (aArr[i] == '.' || counterToDot == length) {
                    break;
                }
            }else {
                System.out.println("False");
                return;
            }
        }
        for (int j = counterToDot; j < length; j++) {
            if (aArr[j] == bArr[j]){
                counterAfterDot++;
                if (counterAfterDot >= 6){
                    System.out.println("True");
                    return;
                }
            }else break;
        }
        System.out.println("False");
    }
}