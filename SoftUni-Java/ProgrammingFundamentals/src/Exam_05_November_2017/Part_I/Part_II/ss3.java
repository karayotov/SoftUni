package Exam_05_November_2017.Part_I.Part_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ss3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String encodetText = bufferedReader.readLine();
        String givenValues = bufferedReader.readLine();


       // System.out.println(counter);
    }

    public static List<String> StringToList(String a) {
        List<String> list = Arrays.stream(a.split("\\s+"))
                .map(String::valueOf)
                .collect(Collectors.toList());
        return list;
    }

    public static String[] StringToArray(String a) {
        String[] array = Arrays.asList(a
                .split(" "))
                .stream()
                .filter(str -> !a.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        return array;
    }

    public static String Concat(List<String> strings, int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end; i++) {
            sb.append(strings.get(i));
        }
        String result = sb.toString();

        return result;
    }
}
//parolata_ama_drugata