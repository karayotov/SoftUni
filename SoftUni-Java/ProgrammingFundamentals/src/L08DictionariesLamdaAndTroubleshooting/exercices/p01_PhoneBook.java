package L08DictionariesLamdaAndTroubleshooting.exercices;

import java.util.*;
import java.util.stream.Stream;

public class p01_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        String phoneNumber = "";
        String end = "END".toLowerCase();

        Map<String, String> phoneBook = new HashMap<String, String>();
       // do {
            String[] arrayInput = Arrays.stream(scanner.nextLine()
                    .split("\\s+"))
                    .toArray(String[]::new);


          //  if (arrayInput[0].equals("A")){
                //if () проверка за повтарящ се key
                phoneBook.put(arrayInput[1], arrayInput[2]);
        //   }else if (arrayInput[0].equals("S"){

        //       System.out.println(phoneBook.);
        //   }
        //   phoneNumber = scanner.nextLine();
        //while (name != end && phoneNumber != end);
    }
}
