package Course.L07_Lists.exercices;

import java.util.*;

public class p03_SearchForNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringListFromScanner = scanner.nextLine();
        String stringArrayWithCommands = scanner.nextLine();

        List<String> listToManipulate = new ArrayList<>(StringList(stringListFromScanner));
        ArrayWithCommands(stringArrayWithCommands);

        int numbersToTake = ArrayWithCommands(stringArrayWithCommands)[0];
        int elementsToDelete = ArrayWithCommands(stringArrayWithCommands)[1];
        int numberToFound = ArrayWithCommands(stringArrayWithCommands)[2];

        List<String> afterTaken = new ArrayList<>();

        if (numbersToTake <= listToManipulate.size()){

            for (int i = 0; i < numbersToTake; i++) {
                afterTaken.add(listToManipulate.get(i));
            }
        }
        List<String> afterDelete = new ArrayList<>();

        if (elementsToDelete <= afterTaken.size()){
            for (int i = elementsToDelete; i < afterTaken.size(); i++) {
                afterDelete.add(afterTaken.get(i));
            }
        }

        for (int i = 0; i < afterDelete.size(); i++) {

            if (afterDelete.contains(Integer.toString(numberToFound))){
                System.out.println("YES!");
                return;
            }
        }
        System.out.println("NO!");
    }


    public static int[] ArrayWithCommands (String inputString){

        int[] arrayWithCommands  = Arrays.stream(inputString.split("\\s+"))
                .map(String::trim)
                .mapToInt(Integer::parseInt).toArray();


        return arrayWithCommands;
    }

    public static List<Integer> ListFromScanner (String inputString){
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        int countToken = stringTokenizer.countTokens();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < countToken; i++) {
            integerList.add(i, Integer.parseInt((String) stringTokenizer.nextElement()));
        }
        return integerList;
    }

    public static List<String> StringList (String inputString){
        List<String> stringList = new ArrayList<>(Arrays.asList(inputString.split("\\s+")));

        return stringList;
        }
    }
