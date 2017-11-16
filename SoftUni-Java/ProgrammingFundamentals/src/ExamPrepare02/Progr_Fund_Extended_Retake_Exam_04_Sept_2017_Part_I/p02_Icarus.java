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
        int stepsCount;
        int endIndex;
        int damage = 1;


        while (!"Supernova".equals(command[0])){

            stepsCount = Integer.parseInt(command[1]);


            if (("left".equals(command[0]) && stepsCount >= 0) || ("right".equals(command[0]) && stepsCount < 0)){

                endIndex = startingIndex - Math.abs(stepsCount);    //трябва ли проверка за отрицателен индекс на стъпките

                inputList = new ArrayList<>(left(inputList, startingIndex, endIndex, damage));

                if (endIndex < 0){
                    startingIndex = inputList.size() - (Math.abs(endIndex));
                    damage++;
                }else {
                    startingIndex = endIndex;
                }

            }else if (("right".equals(command[0]) && stepsCount >= 0) || ("left".equals(command[0]) && stepsCount < 0)){

                endIndex = startingIndex + Math.abs(stepsCount);

                inputList = new ArrayList<>(right(inputList, startingIndex, endIndex, damage));

                if (endIndex > inputList.size() - 1){
                    startingIndex = endIndex - (inputList.size() - 1);
                    damage++;
                }else {
                    startingIndex = endIndex;
                }
            }

            command = bufferedReader.readLine().split("\\s+");
        }
        String resultToStr = Arrays.toString(inputList.toArray()).replace("[", "").replace("]", "").replace(", ", " ");
        System.out.println(resultToStr);
    }


    public static List<Integer> left (List<Integer> list, int currentIndex, int endIndex, int damage){

        int oldVal;

        //при стартиране на програмата трябва ли да отчета damage на стартиращия индекс?

        for (int i = currentIndex - 1; i >= endIndex; i--) {

            if (endIndex < 0 && i < 0){

                i = list.size() - 1;           //променям старт и край на цикъла за да мине от другата страна на листа и да продължи
                endIndex = i - Math.abs(endIndex) + 1; //при минаване от другата страна >= става на >, като съкращаваме цикъла с 1
                damage ++;
            }
            oldVal = list.get(i);
            list.set(i, oldVal - damage);
        }
        return list;
    }

    public static List<Integer> right(List<Integer> list, int currentIndex, int endIndex, int damage){

        int oldValue;

        for (int i = currentIndex + 1; i <= endIndex; i++) {

            if (endIndex > list.size() - 1){
                i = 0;
                endIndex = endIndex - (list.size() - 1);
                damage++;
            }
            oldValue = list.get(i);
            list.set(i, oldValue - damage);
        }
        return list;
    }
}
