package L07_Lists.exercices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p05_ArrayMan {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
               .map(Integer::valueOf)
               .collect(Collectors.toList());
       // List<Integer> numbers = new ArrayList<>();
       // String[] nums =


        String command = reader.readLine();
        while (!"print".equals(command)){
            String[] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "add":
                    int index = Integer.parseInt(tokens[1]);
                    int element = Integer.parseInt(tokens[2]);
                    numbers.add(index, element);
                    break;
                case "addMany":
                    index = Integer.parseInt(tokens[1]);
                    List<Integer> arr = Arrays.stream(tokens).skip(2).map(Integer::parseInt)
                            .map(Integer::valueOf)
                            .collect(Collectors.toList());
                    numbers.addAll(index, arr);
                    break;
                case "contains":
                    element = Integer.parseInt(tokens[1]);
                    numbers.indexOf(element);
                    break;
                case "remove":
                    index = Integer.parseInt(tokens[1]);
                    numbers.remove(index);
                    break;
                case "shift":
                    int pos = Integer.parseInt(tokens[1]);
                    Collections.rotate(numbers, pos * - 1);
                    break;
                case "sumPairs":
                    List<Integer> temp = new ArrayList<>();

                    for (int i = 1; i < numbers.size(); i += 2) {
                        int first = numbers.get(i);
                        int second = numbers.get(i - 1);
                        temp.add(first + second);
                    }

                    if (numbers.size() % 2 != 0){
                        temp.add(numbers.get(numbers.size() - 1));
                    }
                    numbers.clear();
                    numbers.addAll(temp);

            }
            command = reader.readLine();
        }
        System.out.println(numbers);
    }
}
