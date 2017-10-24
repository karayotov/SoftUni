package L08DictionariesLamdaAndTroubleshooting.exercices;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isUpperCase = false;
        String resourceStr = "";
        int quantityInt = 0;
        int newKeyValue = 0;
        int loopCounter = 0;

        Map<String, Integer> map = new LinkedHashMap<>();
        do {
            resourceStr = scanner.nextLine();

            if (!resourceStr.equals("stop")) {

                quantityInt = Integer.parseInt(scanner.nextLine());

                if (map.containsKey(resourceStr)){
                    newKeyValue = map.get(resourceStr) + quantityInt;
                    map.put(resourceStr, newKeyValue);
                }else {
                    map.put(resourceStr, quantityInt);
                }
            }
        }while (!resourceStr.equals("stop"));
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " -> " + value);
        }
    }
}