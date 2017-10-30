package Course.L07_Lists.exercices;

import java.util.*;
import java.util.stream.Collectors;

public class p02_ChangeList_v02 {
    public static Scanner scanner = new Scanner(System.in);
    public static String inputList = scanner.nextLine();
    public static String inputCommand = "";


    public static void main(String[] args) {

        StringTokenizer stringTokenizer = new StringTokenizer(inputList);
        int count = stringTokenizer.countTokens();
        List<Integer> integerList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            integerList.add(i, Integer.parseInt((String) stringTokenizer.nextElement()));
        }
        int listSize = 0;
        int oddEvenCounter = 0;

        while (!inputCommand.equals("Odd") && !inputCommand.equals("Even")) {

            inputCommand = scanner.nextLine();
            String[] commandArr = inputCommand.split(" ");
            if (commandArr[0].equals("Delete") && integerList.contains(Integer.parseInt(commandArr[1]))) {
                listSize = integerList.size();
                //проверка за наличие и триене на елементи
                for (int i = 0; i < listSize; i++) {
                    if (integerList.get(i).equals(Integer.parseInt(commandArr[1]))) {
                        integerList.remove(i);
                        listSize--;
                    }
                }
            } else if (commandArr[0].equals("Insert") && integerList.size() >= Integer.parseInt(commandArr[2])) {
                integerList.add(Integer.parseInt(commandArr[2]), Integer.parseInt(commandArr[1]));
            }
        }
        List<Integer> oddOrEvenList = new ArrayList<>();
        if (inputCommand.equals("Odd")) {
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) % 2 != 0) {
                    oddOrEvenList.add(oddEvenCounter, integerList.get(i));
                    oddEvenCounter++;
                }
            }
        }
        if (inputCommand.equals("Even")) {
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) % 2 == 0) {
                    oddOrEvenList.add(oddEvenCounter, integerList.get(i));
                    oddEvenCounter++;
                }
            }
        }
        String listToString = oddOrEvenList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        System.out.println(listToString);
    }
}