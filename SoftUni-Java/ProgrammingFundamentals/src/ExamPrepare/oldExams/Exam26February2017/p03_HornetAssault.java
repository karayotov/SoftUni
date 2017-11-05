package ExamPrepare.oldExams.Exam26February2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p03_HornetAssault {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //On the first line of input you will receive a sequence of integers, separated by spaces – the beehives.
        String beehivesStr = bufferedReader.readLine();
        //On the second line of input you will receive a sequence of integers, separated by spaces – the hornets.
        String hornetStr = bufferedReader.readLine();


        List<Long> beehivesList = StringToList(beehivesStr);
        List<Long> hornetsList = StringToList(hornetStr);
        Long powerOfTheHornets = PowerOfHornets(hornetsList);

        Long beesInOneBeehive = 0L;
        Long beesAfterFight = 0L;

        for (int i = 0; i < beehivesList.size(); i++) {
            if (hornetsList.isEmpty()){
                break;
            }
            beesInOneBeehive = beehivesList.get(i);
            beesAfterFight = beesInOneBeehive - powerOfTheHornets;

            if (beesInOneBeehive >= powerOfTheHornets){
                beehivesList.set(i, beesAfterFight);

                powerOfTheHornets -= hornetsList.get(0);
                hornetsList.remove(0);
            }else {
                beehivesList.remove(i);
                i--;
            }
        }
        PrintWinningSide(beehivesList, hornetsList);
    }

    public static void PrintWinningSide (List<Long> bees, List<Long> hornets){
        for (int i = 0; i < bees.size(); i++){
            if (bees.get(i) <= 0){
                bees.remove(i);
                i--;
            }
        }
        if (bees.isEmpty()){
            hornets.forEach(x -> System.out.print(x + " "));
        }else {
            bees.forEach(x -> System.out.print(x + " "));
        }
    }

    public static List<Long> StringToList(String a){
        List<Long> list = Arrays.stream(a.split("\\s+"))
                .map(Long::valueOf)
                .collect(Collectors.toList());
        return list;
    }

    public static String[] StringToArray (String a){
        String[] array = Arrays.asList(a
                .split(" "))
                .stream()
                .filter(str -> !a.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        return array;
    }
    public static Long PowerOfHornets (List<Long> a){
        long sumOfPowers = 0;
        for (Long x : a) {
            sumOfPowers += x;
        }
        return sumOfPowers;
    }
}
