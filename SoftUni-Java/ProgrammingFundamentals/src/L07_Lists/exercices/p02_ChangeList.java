package L07_Lists.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class p02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringTokenizer strToken = new StringTokenizer(input);
        int count = strToken.countTokens();
        System.out.println(count);
        List<Integer> list = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {

            list.add(i, Integer.parseInt((String)strToken.nextElement()));
        }
        String listToString = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(listToString);
    }
}

//number = number % number.Count; не позволява да прехвърлим листа?