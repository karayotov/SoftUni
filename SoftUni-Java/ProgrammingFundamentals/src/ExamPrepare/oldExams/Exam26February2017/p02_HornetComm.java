package ExamPrepare.oldExams.Exam26February2017;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_HornetComm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr;
        String secondPart;
        String firstPart;

        List<String> messages = new LinkedList<>();
        List<String> broadcasts = new LinkedList<>();

        while (!"Hornet is Green".equals(inputStr = bufferedReader.readLine())) {

            String[] inputArr = inputStr.split(" <-> ");
            firstPart = inputArr[0];
            if (inputArr.length > 1) {
                secondPart = inputArr[1];

                if (IsCommunication(secondPart)) {
                    if (IsMessage(firstPart, secondPart)) {
                        firstPart = new StringBuilder(firstPart).reverse().toString();
                        messages.add(firstPart + " -> " + secondPart);
                    } else {
                        secondPart = UpperLowerCase(secondPart);
                        broadcasts.add(secondPart + " -> " + firstPart);
                    }
                }
            }
        }

        System.out.println("Broadcasts:");

        if (broadcasts.isEmpty()){
            System.out.println("None");
        }else {
            broadcasts.forEach(System.out::println);
        }

        System.out.println("Messages:");

        if (messages.isEmpty()){
            System.out.println("None");
        }else {
            messages.forEach(System.out::println);
        }
    }

    public static boolean IsCommunication (String b){

        Pattern digitsOrLetters = Pattern.compile("[^0-9a-zA-Z]");

        Matcher commCheck = digitsOrLetters.matcher(b);

        if (commCheck.find()){
            return false;
        }else {
            return true;
        }
    }

    public static boolean IsMessage(String a, String b){
        Pattern digitsOnly = Pattern.compile("[0-9]");

        Matcher matcherA = digitsOnly.matcher(a);

        if (matcherA.find()){
            return true;
        }else {
            return false;
        }
    }

    public static String UpperLowerCase (String a){
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))){
                char currentCharToLowercase = Character.toLowerCase(a.charAt(i));
                result += currentCharToLowercase;
            }else if(Character.isLowerCase(a.charAt(i))){
                char currentCharToUpperCase = Character.toUpperCase(a.charAt(i));
                result += currentCharToUpperCase;
            }else {
                result += a.charAt(i);
            }
        }
        return result;
    }
}
