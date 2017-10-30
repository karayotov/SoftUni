package Course.L07_Lists.exercices;

import java.util.*;

public class p07_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringToBomb = scanner.nextLine();
        String detonator = scanner.nextLine();

        List<String> listToBomb = new ArrayList<>(StringList(stringToBomb));
        ArrayWithCommands(detonator);




        int detonatorNum = ArrayWithCommands(detonator)[0];
        int power = ArrayWithCommands(detonator)[1];

        int lengthOfHashMap = listToBomb.size();
        HashMap<Integer, String> hashMapLocation = new HashMap<>();
        for (int i = 0; i < lengthOfHashMap; i++) {
            if (hashMapLocation.containsValue(Integer.toString(detonatorNum))){
                hashMapLocation.put(i, listToBomb.get(i));
                for (int j = i - (power + 1); j < i; j++) {
                    hashMapLocation.remove(j);
                }

            }else {
                hashMapLocation.put(i, listToBomb.get(i));
            }
        }
        //този фор цикъл не действа
        for (int k = 0; k < hashMapLocation.size(); k++) {
            if (hashMapLocation.containsValue(Integer.toString(detonatorNum))) {
                for (int q = k; q < k + (power + 1) ; q++) {
                    hashMapLocation.remove(q);
                }
            }
        }
        System.out.println(hashMapLocation); //знам, че по условие трябва да се сумира остатъка :)
    }

    public static int[] ArrayWithCommands (String inputString){

        int[] arrayWithCommands  = Arrays.stream(inputString.split("\\s+"))
                .map(String::trim)
                .mapToInt(Integer::parseInt).toArray();
        return arrayWithCommands;
    }

    public static void ListFromScanner (String inputString){
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        int countToken = stringTokenizer.countTokens();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < countToken; i++) {
            integerList.add(i, Integer.parseInt((String) stringTokenizer.nextElement()));
        }
    }

    public static List<String> StringList (String inputString){
        List<String> stringList = new ArrayList<>(Arrays.asList(inputString.split("\\s+")));

        return stringList;
    }
}
