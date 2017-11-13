package ExamPrepare02.Progr_Fund_Extended_Retake_Exam_04_Sept_2017_Part_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p02_Icarus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputList = Arrays.stream(bufferedReader.readLine()
                .split("\\s+"))
                .map(Integer :: valueOf)
                .collect(Collectors.toList());
        int startingIndex = Integer.parseInt(bufferedReader.readLine());

        String[] command = bufferedReader.readLine().split("\\s+");

        int endIndex = startingIndex - stepsCount;

        while (!"Supernova".equals(command[0])){


            command = bufferedReader.readLine().split("\\s+");
        }
    }
    public static List<Integer> left (List<Integer> list, int currentIndex, int stepsCount){
        int oldVal;


        for (int i = currentIndex; i >= endIndex; i--) {
            if (i < currentIndex){
                oldVal = list.get(i);
                list.add(list.get(i), oldVal - 1);
                if (i == 0){
                    break;
                }
            }
        }
        if (endIndex < 0){
            oldVal = list.get(list.size()); //вадим от последната стойност 1
            list.add(list.size(), oldVal - 1);

        }

        return list;
    }
}
