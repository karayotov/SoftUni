package ExamPrepare.oldExams.Exam26February2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class p04_HornetArmada_OutSorce {
    public static void main(String[] Args) throws Exception {


        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        LinkedHashMap<String, Integer> legions_Activity = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<String, Long>> legions_Soldiers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] soldierInformation = read.readLine().split("[\\- >=:]+");


            int lastActivity = Integer.parseInt(soldierInformation[0]);
            String legionName = soldierInformation[1];
            String soldierType = soldierInformation[2];
            long soldierCount = Integer.parseInt(soldierInformation[3]);


            if (!legions_Activity.containsKey(legionName)) {

                legions_Activity.put(legionName, lastActivity);
                legions_Soldiers.put(legionName, new LinkedHashMap<String, Long>());
            }

            if (lastActivity > legions_Activity.get(legionName)) {
                legions_Activity.put(legionName, lastActivity);
            }

            if (!legions_Soldiers.get(legionName).containsKey(soldierType)) {
                legions_Soldiers.get(legionName).put(soldierType, 0L);
            }

            LinkedHashMap<String, Long> temp = legions_Soldiers.get(legionName);
            if (!temp.containsKey(legionName)) {
                temp.put(soldierType, temp.get(soldierType) + soldierCount);
            }
            legions_Soldiers.put(legionName, temp);
        }


        String[] params = read.readLine().split("\\\\");

        if (params.length > 1) {

            LinkedHashMap<String, Long> outputInformation = new LinkedHashMap<>();

            for (String legionName : legions_Activity.keySet()) {

                if (Integer.parseInt(params[0]) > legions_Activity.get(legionName)) {

                    if (legions_Soldiers.get(legionName).containsKey(params[1]))
                        outputInformation.put(legionName, legions_Soldiers.get(legionName).get(params[1]));
                }
            }

            outputInformation.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).
                    forEach((entry) -> {
                        System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
                    });

        } else {

            TreeMap<String, Integer> outputInformation = new TreeMap<>();

            for (Map.Entry<String, LinkedHashMap<String, Long>> s : legions_Soldiers.entrySet()) {

                String legionName = s.getKey();
                TreeMap<String, Long> a = new TreeMap<>(s.getValue());

                for (Map.Entry<String, Long> entry : a.entrySet()) {
                    if (params[0].equals(entry.getKey())) {

                        outputInformation.put(legionName, legions_Activity.get(legionName));
                    }
                }
            }

            outputInformation.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).
                    forEach((entry) -> {
                        System.out.printf("%d : %s\n", entry.getValue(), entry.getKey());
                    });
        }
    }
}