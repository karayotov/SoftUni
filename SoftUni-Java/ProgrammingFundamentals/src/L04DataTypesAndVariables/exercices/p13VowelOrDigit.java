package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p13VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().toLowerCase().charAt(0);

        System.out.println(CharCheck(input));
    }

    public static String CharCheck(char a){
        String checker = "";
        if ("aeiou".indexOf(a) != -1){
            checker = "vowel";
        }else if ("0123456789".indexOf(a) != -1){
            checker = "digit";
        }
        else {
            checker = "other";
        }
        return checker;
    }
}