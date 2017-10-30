package Course.L11_StringsAndTextProcessing.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01_ConvertFromBase10toBaseN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> inpustList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        long baseN = Integer.parseInt(inpustList.get(0));
        long baseTen = Integer.parseInt(inpustList.get(1));
        long bin = 0;
        StringBuilder binaryStrBldReversed = new StringBuilder();

        while (true) {
            bin = baseTen % baseN;
            baseTen /= baseN;

            binaryStrBldReversed.append(bin);

            String result = new StringBuilder(binaryStrBldReversed).reverse().toString();
            System.out.println(result);
        }
    }
}
