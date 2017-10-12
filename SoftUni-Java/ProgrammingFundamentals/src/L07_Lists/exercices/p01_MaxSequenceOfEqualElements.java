package L07_Lists.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p01_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>  numsList = new ArrayList<Integer>(Integer.parseInt(scanner.nextLine()));
        int counter = 1;
        int number = 0;

        for (int i = 0; i < numsList.size() - 1; i++) {
            for (int j = i + 1; j < numsList.size(); j++) {
                while ((numsList.equals(numsList.get(i) == numsList.get(j)))){
                    counter++;
                    number = numsList.get(i);
                }
            }
        }
    }
  //public static int ElementCount(int counter){

  //}
}