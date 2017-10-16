package L07_Lists.exercices;

import java.util.*;
import java.util.stream.Collectors;

public class p01_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 0;
        int prevCount = 0;
        String mostRepeated = "";

        StringTokenizer stringTokenizer = new StringTokenizer(input);
        int tokenCount = stringTokenizer.countTokens();
        List<String> stringList = new ArrayList<>(tokenCount);

        for (int i = 0; i < tokenCount; i++) {
            stringList.add(i, (String) stringTokenizer.nextElement());
        }
        String listToString = stringList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));


        String[] stringArr = listToString.split(" ");
        mostRepeated = stringArr[0];

        for (int i = 1; i < stringArr.length; i++) {
            if (stringArr[i].matches(stringArr[i - 1])) {
                counter++;
                if (counter > prevCount) {
                    mostRepeated = stringArr[i];
                    prevCount++;
                }
            } else {
                prevCount = counter;
                counter = 0;
            }
        }
        for (int i = 0; i <= prevCount; i++) {
            System.out.print(mostRepeated);
            if (i < prevCount){
                System.out.print(" ");
            }
        }
    }
}