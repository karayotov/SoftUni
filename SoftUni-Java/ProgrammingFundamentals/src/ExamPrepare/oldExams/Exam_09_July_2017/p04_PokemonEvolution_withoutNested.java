package ExamPrepare.oldExams.Exam_09_July_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p04_PokemonEvolution_withoutNested {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> inputMap = new LinkedHashMap<>();

        String input;

        while (!"wubbalubbadubdub".equals(input = bufferedReader.readLine())){
            String[] tokens = input.split(" -> ");

            if (tokens.length > 1){
                inputMap.putIfAbsent(tokens[0], new ArrayList<>());
                String str = tokens[1] + " <-> " + tokens[2];
                inputMap.get(tokens[0]).add(str);
            }else if (inputMap.containsKey(tokens[0])){
                System.out.println("# " + tokens[0]);
                inputMap.get(tokens[0])
                        .forEach(System.out::println);
                        //or
                        // .forEach(e -> System.out.println(e));
            }
        }

        inputMap.forEach((key, value) -> {
            System.out.println("# " + key);
            value.stream().
                    sorted((first, second) -> {
                int firstNum = Integer.parseInt(first.split(" <-> ")[1]);
                int secondNum = Integer.parseInt(second.split(" <-> ")[1]);

                return Integer.compare(secondNum, firstNum);

            }).forEach(System.out::println);
        });
    }
}
