package Exam_05_November_2017.Part_I.Part_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ss2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        String toDo = "";
        int start = 0;
        int end = 0;
        String commandsStr;
        List<String> inputArr = new ArrayList<>();


        while (!"3:1".equals(commandsStr = bufferedReader.readLine())) {
            String[] commandsArr = StringToArray(commandsStr);
            toDo = commandsArr[0];
            if (toDo.equals("merge")) {
                start = Integer.parseInt(commandsArr[1]);
                end = Integer.parseInt(commandsArr[2]);

                inputArr = merge(inputArr, start, end);

            }else if (toDo.equals("divide")){
                int index = Integer.parseInt(commandsArr[1]);
                int partitions = Integer.parseInt(commandsArr[2]);

                inputArr = divide(inputArr, index, partitions);
            }
        }
        System.out.println(listToString(inputArr));
    }

    public static String listToString(List<String> list){
        StringBuilder stringBuilder = new StringBuilder();

        for(String str : list){
            stringBuilder.append(str);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static int awaysInRange(int index, int maxLength) {

        if (index < 0) {
            index = 0;
        }
        if (index >= maxLength) {
            index = maxLength - 1;
        }

        return index;
    }

    public static List<String> merge(List<String> list, int startIndex, int endIndex) {

        startIndex = awaysInRange(startIndex, list.size());
        endIndex = awaysInRange(endIndex, list.size());

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < startIndex; i++) {

            newList.add(list.get(i));
        }

        String concatenated = concat(list, startIndex, endIndex);

        newList.add(concatenated);

        for (int j = endIndex + 1; j < list.size(); j++) {
            newList.add(list.get(j));
        }
        return newList;
    }

    public static List<String> divide(List<String> list, int index, int partitions){

        String element = list.get(index);

        int partitionLength = element.length() / partitions;

        List<String> dividedPartitions = new ArrayList<>();

        for (int i = 0; i < partitions; i++) {
            if (i == partitions - 1){
                dividedPartitions.add(element.substring(i * partitionLength, partitionLength));
            }
        }
        list.remove(index);
        //НЕ ЗНАМ ДАЛИ Е АНАЛОГИЧНО НА sensitiveData.InsertRange(index, dividedPartitions);

        for (int i = 0; i < dividedPartitions.size(); i++) {
            list.add(index, dividedPartitions.get(i));
            index++;
        }
        //Now whats the logic with the i * partitionLength

        //EXAMPLE NO.1: We have "abcdef" we want to divide it by 4.
        //partitionLength = element.Length (6) / partition (4) = 1 (integer division)
        //for (i = 0; i < 4; i++)
        //First iteration - i = 0. 0 * 1 = 0. Start index - 0, length - 1, Substring result - "a"
        //Second iteration - i = 1. 1 * 1 = 1. Start index - 1, length - 1, Substring result - "b"
        //Third iteration - i = 2. 2 * 1 = 2. Start index - 2, length - 1, Substring result - "c"
        //Fourth iteration (FINAL ITERATION) - i = 3, 3 * 1 = 3. Start index - 3, length - none, Substring result - "def"

        //EXAMPLE NO.2: Lets try with a longer string.
        //We have "123456789" we want to divide it by 4.
        //partitionLength = element.Length (9) / partition (4) = 2 (integer division)
        //for (i = 0; i < 4; i++)
        //First iteration - i = 0. 0 * 2 = 0. Start index - 0, length - 2, Substring result - "12"
        //Second iteration - i = 1. 1 * 2 = 2. Start index - 2, length - 2, Substring result - "34"
        //Third iteration - i = 2. 2 * 2 = 4. Start index - 4, length - 2, Substring result - "56"
        //Fourth iteration (FINAL ITERATION) - i = 3, 3 * 2 = 6. Start index - 6, length - none, Substring result - "789"
        return list;
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

    public static String concat (List<String> strings, int start, int end){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> sample = new ArrayList<String>();

        for (int i = start; i < end; i++){
            sb.append(strings.get(i));
            sample.add(strings.get(i));
        }
        String result = sb.toString();
        return result;
    }
}
