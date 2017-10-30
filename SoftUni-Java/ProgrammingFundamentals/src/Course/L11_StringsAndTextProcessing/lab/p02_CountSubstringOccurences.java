package Course.L11_StringsAndTextProcessing.lab;


        import java.util.Scanner;

public class p02_CountSubstringOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textForCheck = scanner.nextLine().toLowerCase();
        String substringChecker = scanner.nextLine().toLowerCase();
        int lastIndex = 0;
        int count = 0;


        while (lastIndex != -1){
            lastIndex = textForCheck.indexOf(substringChecker, lastIndex);
            if (lastIndex != -1){
                count++;
                lastIndex++;
            }
        }
        System.out.println(count);
    }
}
