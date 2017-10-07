package L06Arrays.exercices;

import java.util.Scanner;

public class p01LargestCommonEnd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String arr1[] = {scanner.nextLine()};
        String arr2[] = {scanner.nextLine()};

        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        int counter = 0;

        if (lengthArr1 <= lengthArr2) {

            for (int i = 0; i < lengthArr1; i++) {
                for (int j = 0; j < lengthArr1; j++) {
                    while (arr1[i] == arr2[j]) {
                        counter++;
                    }
                }
            }
        } else {
            for (int i = 0; i < lengthArr2; i++) {
                for (int j = 0; j < lengthArr2; j++) {
                    while (arr1[i] == arr2[j]) {
                        counter++;
                    }
                }
            }
        }
        if (counter != 0) {
            System.out.printf("The largest common end is at the %d", counter);
        } else {
            System.out.printf("No common words at the left and right");
        }

    }
}