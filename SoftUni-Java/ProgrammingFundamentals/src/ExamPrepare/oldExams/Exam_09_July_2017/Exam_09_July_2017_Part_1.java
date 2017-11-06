//package ExamPrepare.oldExams;
//
//import java.util.Scanner;
//
//public class Exam_09_July_2017_Part_1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //poke power:
//        int n = Integer.parseInt(scanner.nextLine());
//        //distance between targets:
//        int m = Integer.parseInt(scanner.nextLine());
//        //exhaustion factor:
//        int y = Integer.parseInt(scanner.nextLine());
//        //COUNT how many targets you’ve poked...
//        int counter = 0;
//        //original value of N
//        double originN = n;
//
//        //Your task is to start subtracting M from N until N becomes less than M,
//        // i.e. the Poke Mon does not have enough power to reach the next target.
//
//        while (n >= m){
//            n -= m;
//            //IF N becomes equal to EXACTLY 50 % of its original value,...
//            if (n == originN * 0.5){
//                //...you must divide N by Y, if it is POSSIBLE.
//                n = (int) n;
//                if (n >= y){
//                    n /= y;
//                }
//                // This DIVISION is between integers.
//
//            }
//            //Every time you subtract M from N that means you’ve reached a target and poked it successfully.
//            //COUNT how many targets you’ve poked – you’ll need that count.
//            counter++;
//
//        }
//        System.out.println(n);
//        System.out.println(counter);
//    }
//}

package ExamPrepare.oldExams.Exam_09_July_2017;

import java.util.Scanner;

public class Exam_09_July_2017_Part_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //poke power:
        int n = Integer.parseInt(scanner.nextLine());
        //distance between targets:
        int m = Integer.parseInt(scanner.nextLine());
        //exhaustion factor:
        int y = Integer.parseInt(scanner.nextLine());
        //COUNT how many targets you’ve poked...
        int counter = 0;
        //original value of N
        double originN = n;

        //Your task is to start subtracting M from N until N becomes less than M,
        // i.e. the Poke Mon does not have enough power to reach the next target.

        while (n >= m){
            n -= m;
            //IF N becomes equal to EXACTLY 50 % of its original value,...
            if (n == originN * 0.5 && y != 0){
                //...you must divide N by Y, if it is POSSIBLE.
                n /= y;
                // This DIVISION is between integers.

            }
            //Every time you subtract M from N that means you’ve reached a target and poked it successfully.
            //COUNT how many targets you’ve poked – you’ll need that count.
            counter++;

        }
        System.out.println(n);
        System.out.println(counter);
    }
}