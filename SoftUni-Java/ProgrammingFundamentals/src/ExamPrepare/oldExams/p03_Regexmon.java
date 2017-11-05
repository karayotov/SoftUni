package ExamPrepare.oldExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03_Regexmon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String bojomon = "[a-zA-Z]+-[a-zA-Z]+";
        String didimon = "[^a-zA-Z-]+";



        Pattern patternB = Pattern.compile(bojomon);
        Pattern patternD = Pattern.compile(didimon);


        while (true) {

            Matcher matcherD = patternD.matcher(string);


            if (matcherD.find()){
                    System.out.println(matcherD.group());
                string = string.replaceAll("^.*?([^a-zA-Z-]+)", "");
                string = string.replace("[^a-zA-Z-]+", "");
            }
            else {
                return;
            }

            Matcher matcherB = patternB.matcher(string);

            if (matcherB.find()){
                    System.out.println(matcherB.group());
                string = string.replaceAll("^.*?([a-zA-Z]+-[a-zA-Z]+)", "");
                string = string.replace("[a-zA-Z]+-[a-zA-Z]+", "");
            }
            else {
                return;
            }
        }
    }
}