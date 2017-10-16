package L08DictionariesLamdaAndTroubleshooting.exercices;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class p01_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        String phoneNumber = "";
        String end = "END";
        String key = "";
        String value = "";

        Map<String, String> phoneBook = new HashMap<>();

        inputString = scanner.nextLine();

        while (!inputString.equals(end)){
            String[] arrayInput = inputString.split("\\s+");

            key = arrayInput[1].toString();


            if (arrayInput[0].equals("A")) {
                if (!phoneBook.containsKey(key)){

                    value = arrayInput[2].toString();
                    phoneBook.put(key, value);
                }else {
                    value = arrayInput[2].toString();
                    phoneBook.put(key, value);

                }
            } else if (arrayInput[0].equals("S")) {

                if (phoneBook.containsKey(key)){
                    value = phoneBook.get(key);
                    System.out.printf("%s -> %s%n", key, value);

                }else {

                    System.out.printf("Contact %s does not exist.%n", key); //key носи ли стойността от try скобите?
                }
            }
            inputString = scanner.nextLine();
        }
    }
}