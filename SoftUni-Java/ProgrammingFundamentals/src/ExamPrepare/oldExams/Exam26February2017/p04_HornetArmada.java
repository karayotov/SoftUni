package ExamPrepare.oldExams.Exam26February2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class p04_HornetArmada {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> legionsWithActivity = new LinkedHashMap<>();
        Map<String, Map<String, Long>> legionsWithSoldiers = new LinkedHashMap<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        //String inputPattern = "(\\d+)\\s\\=\\s(.+)\\s\\-\\>\\s(.+)\\:(\\d+)";
        LinkedHashMap<String, Integer> legionsActivity = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<String, Long>> legionsSoldiers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] soldiersInfo = bufferedReader.readLine().split("[\\- >=:]+");

            int lastActivity = Integer.parseInt(soldiersInfo[0]);
            String legionName = soldiersInfo[1];
            String soldierType = soldiersInfo[2];
            long soldierCount = Long.parseLong(soldiersInfo[3]);

            legionsActivity.putIfAbsent(legionName, lastActivity);
            legionsSoldiers.putIfAbsent(legionName, new LinkedHashMap<>());

            if (lastActivity > legionsActivity.get(legionName)){

                legionsActivity.put(legionName, lastActivity);
            }

            legionsSoldiers.get(legionName).putIfAbsent(soldierType, 0L);

            LinkedHashMap<String, Long> temp = legionsSoldiers.get(legionName);
            //добавяне на стойност към съществуващ Key
            temp.putIfAbsent(soldierType, temp.get(soldierType) + soldierCount);
            legionsSoldiers.put(legionName, temp);
        }

        String[] params = bufferedReader.readLine().split("\\\\");

        if (params.length > 1) {

            LinkedHashMap<String, Long> outputInfo = new LinkedHashMap<>();

            for (String legionName : legionsActivity.keySet()){
                if (Integer.parseInt(params[0]) > legionsActivity.get(legionName)) {
                    outputInfo.putIfAbsent(legionName, legionsSoldiers.get(legionName).get(params[1]));
                }
            }

            outputInfo
                    .entrySet()
                    .stream()
                    .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                    .forEach((entry) -> {

                        System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
                    });

        }else {
            TreeMap<String, Integer> outputInfo = new TreeMap<>();
            for (Map.Entry<String, LinkedHashMap<String, Long>> s : legionsSoldiers.entrySet()){

                String legionName = s.getKey();
                TreeMap<String, Long> a = new TreeMap<>();

                for (Map.Entry<String, Long> entry : a.entrySet()){

                    outputInfo.putIfAbsent(legionName, legionsActivity.get(legionName));
                }
            }
            outputInfo
                    .entrySet()
                    .stream()
                    .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                    .forEach(entry -> {

                        System.out.printf("%d : %s%n", entry.getValue(), entry.getKey());
                    });
        }
    }

    public static String[] StringToArray (String a, String regex){
        String[] array = Arrays.asList(a
                .split(regex))
                .stream()
                .filter(str -> !a.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        return array;
    }
}