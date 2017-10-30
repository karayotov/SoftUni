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
        Matcher matcherB = patternB.matcher(string);
        Matcher matcherD = patternD.matcher(string);
        int bigerGroup = Math.max(matcherB.groupCount(), matcherD.groupCount());

        while (true) {
            if (matcherD.find()){
                System.out.println(matcherD.group());
            }else return;
            if (matcherB.find()){
                System.out.println(matcherB.group());
            }else {
                return;
            }
        }
    }
}