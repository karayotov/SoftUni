package Course.L08DictionariesLamdaAndTroubleshooting.exercices;

import java.util.*;

public class p04_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String email = "";
        int loopCounter = 0;
        Map<String, String> map = new LinkedHashMap<>();
        do {
            name = scanner.nextLine();
            if (!name.equals("stop")) {
                email = scanner.nextLine();
                map.put(name, email);
                List<String> listMail = new ArrayList<>(Arrays.asList(email.split("\\.")));
                if (listMail.get(1).equals("uk") || listMail.get(1).equals("us")){
                    map.remove(name);
                }
            }
        }while (!name.equals("stop"));
        for (Map.Entry<String, String> entry :
             map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " -> "+ value);

        }
    }
}
