package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p05booleanVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean yesOrNo = Boolean.parseBoolean(scanner.nextLine());
        if (yesOrNo){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}