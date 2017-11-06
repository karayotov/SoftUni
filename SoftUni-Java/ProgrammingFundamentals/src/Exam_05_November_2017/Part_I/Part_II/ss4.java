package Exam_05_November_2017.Part_I.Part_II;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ss4 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static List<String> StringToList(String a){
        List<String> list = Arrays.stream(a.split("\\s+"))
                .map(String::valueOf)
                .collect(Collectors.toList());
        return list;
    }

    public static String[] StringToArray (String a) {
        String[] array = Arrays.asList(a
                .split(" "))
                .stream()
                .filter(str -> !a.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        return array;
    }
}

//parolata_ama_drugata