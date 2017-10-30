package Course.L05MethodsDebugingAndTrubleshooting.exercices;

import java.util.Scanner;

public class p03EnglishNameofTheLastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String givenNum = scanner.nextLine();


        String lastDigitString =  givenNum.substring(givenNum.length() - 1);
        int lastDigitNum = Integer.parseInt(lastDigitString);
        NameOfLastDigit(lastDigitNum);
    }



    public static void NameOfLastDigit(int number){
        String theName = "";

        switch (number){
            case 0:
                theName += "zero";
                break;
            case 1:
                theName += "one";
                break;
            case 2:
                theName += "two";
                break;
            case 3:
                theName += "three";
                break;
            case 4:
                theName += "four";
                break;
            case 5:
                theName += "five";
                break;
            case 6:
                theName += "six";
                break;
            case 7:
                theName += "seven";
                break;
            case 8:
                theName += "eight";
                break;
            case 9:
                theName += "nine";
                break;
                default:
                    break;
        }
        System.out.printf("%s", theName);
    }
}
