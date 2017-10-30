package Course.L11_StringsAndTextProcessing.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03_TextFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String substringChecker = scanner.nextLine().toLowerCase();
        String textForCheck = scanner.nextLine().toLowerCase();

        List<String> banList = Arrays.stream(substringChecker.split(", ")).collect(Collectors.toList());

        int lastIndex = 0;
        int count = 0;
        String anyBadWordFromList = "";
        String stars = "";
        int badWordLength = 0;
        StringBuilder censure = null;

        while (lastIndex != -1){
            for (int i = 0; i < banList.size(); i++) {
                textForCheck.indexOf(banList.get(i), lastIndex);
                anyBadWordFromList = banList.get(i);
                badWordLength = anyBadWordFromList.length();

//                stars = new String(new char[badWordLength]).replace('\0', '*').toString();
                stars = "*";
                if (lastIndex != -1){
                    censure = new StringBuilder(textForCheck)
                            .replace(count, (count + anyBadWordFromList.length()), stars);
                    count++;

                    lastIndex += textForCheck.length();
                }
            }
        }
        System.out.println(censure.toString());
    }
}