package Exam_05_November_2017.Part_I.Part_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
            List<String> list = StringToList(input);


            while (!"3:1".equals(commandsStr = bufferedReader.readLine())){
                System.out.println(commandsStr);
                String[] commandsArr = StringToArray(commandsStr);
                toDo = commandsArr[0];
                if (toDo.equals("merge")){
                    start = Integer.parseInt(commandsArr[1]);
                    end = Integer.parseInt(commandsArr[2]);
                    if (start < 0 ){
                        start = 0;
                    }
                    if (end > list.size()){
                            end = list.size();
                    }
//                    if (start <= end) {
//
//                        Concat(list, start, end);
//                        String afterConcat =
//                                list.removeAll()
//                    }
//                    if (list.size() >= 1 && start < end){
//                        for (int i = start; i < end; i++) {
//                                list.remove(i);
//                            if (list.size() != 1){
//
//                                i--;
//                            }else break;
//                        }
//                        list.add(start, afterConcat);
//                    }
                    System.out.println(list);

                }
            }

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

    public static void Concat (List<String> strings, int start, int end){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> sample = new ArrayList<String>();

        for (int i = start; i < end; i++){
            sb.append(strings.get(i));
            sample.add(strings.get(i));
        }
        String result = sb.toString();
    }
}
