//package ExamPrepare.oldExams;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class p02_PokemonDoNotGo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputStr = scanner.nextLine();
//        long sumOfRemoved = 0L;
//        long removedElement = 0L;
//        int index = 0;
//        List<Long> inputList = new ArrayList<Long>();
//        for (String field : inputStr.split(" ")){
//            inputList.add(Long.parseLong(field));
//        }
//
//        while (inputList.size() > 0){
//            index = Integer.parseInt(scanner.nextLine());
//
//            if (index < 0){
//                removedElement = inputList.get(inputList.size() - 1);
//                inputList.set(0, inputList.get(inputList.size() - 1));
//
//            }else if (index >= inputList.size()){
//
//                removedElement = inputList.get(0);
//                inputList.set(inputList.size() - 1, inputList.get(0));
//            }else {
//                removedElement = inputList.get(index);
//                inputList.remove(index);
//
//            }
//            sumOfRemoved += removedElement;
//            inputList = new ArrayList<Long>(resizedList(inputList, removedElement));
//        }
//        System.out.println(sumOfRemoved);
//    }
//    public static List<Long> resizedList(List<Long> inputList, long index){
//        for (int i = 0; i < inputList.size(); i++) {
//
//            long newValue = 0L;
//            if (inputList.get(i) <= index) {
//                newValue = inputList.get(i) + index;
//                inputList.set(i, newValue);
//
//
//            } else {
//                newValue = inputList.get(i) - index;
//                inputList.set(i, newValue);
//            }
//        }
//        return inputList;
//    }
//}

package ExamPrepare.oldExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02_PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        long sumOfRemoved = 0L;
        long removedElement = 0L;
        int index = 0;
        List<Long> inputList = new ArrayList<Long>();
        for (String field : inputStr.split(" ")){
            inputList.add(Long.parseLong(field));
        }

        while (inputList.size() > 0){
            index = Integer.parseInt(scanner.nextLine());

            if (index < 0){
                removedElement = inputList.remove(inputList.size() - 1);
                inputList.add(0, inputList.get(inputList.size() - 1));

            }else if (index >= inputList.size()){

                removedElement = inputList.remove(0);
                inputList.add(inputList.get(0));
            }else {
                removedElement = inputList.remove(index);
            }
            sumOfRemoved += removedElement;
            inputList = new ArrayList<Long>(resizedList(inputList, removedElement));
        }
        System.out.println(sumOfRemoved);
    }
    public static List<Long> resizedList(List<Long> inputList, long index){
        for (int i = 0; i < inputList.size(); i++) {

            long newValue = 0L;
            if (inputList.get(i) <= index) {
                newValue = inputList.get(i) + index;
                inputList.set(i, newValue);


            } else {
                newValue = inputList.get(i) - index;
                inputList.set(i, newValue);
            }
        }
        return inputList;
    }
}