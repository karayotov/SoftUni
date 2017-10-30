package Course.L08DictionariesLamdaAndTroubleshooting.exercices;

import java.util.*;

public class p01_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        String phoneNumber = "";
        String end = "END";
        String keys = "";
        String value = "";

        Map<String, String> phoneBook = new HashMap<>();

        inputString = scanner.nextLine();

        while (!inputString.equals(end)){
            String[] arrayInput = inputString.split("\\s+");

            keys = arrayInput[1].toString();


            if (arrayInput[0].equals("A")) {
                if (!phoneBook.containsKey(keys)){

                    value = arrayInput[2].toString();
                    phoneBook.put(keys, value);
                }else {
                    value = arrayInput[2].toString();
                    phoneBook.put(keys, value);

                }
            } else if (arrayInput[0].equals("S")) {

                if (phoneBook.containsKey(keys)){
                    value = phoneBook.get(keys);
                    System.out.printf("%s -> %s%n", keys, value);

                }else {

                    System.out.printf("Contact %s does not exist.%n", keys); //keys носи ли стойността от try скобите?
                }
            }
            inputString = scanner.nextLine();
        }
    }
}