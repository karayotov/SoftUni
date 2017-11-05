package ExamPrepare.oldExams.ExamPreparation2;

import java.util.Arrays;
import java.util.Scanner;

public class p02_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldLength = Integer.parseInt(scanner.nextLine().trim());
        String[] fieldArr = new String[fieldLength];

        String positionBugsStr = scanner.nextLine().trim();
        String[] bugsArr = positionBugsStr.split(" ");
        for (int c = 0; c < fieldArr.length; c++) {
                fieldArr[c] = "0";
        }

        for (int i = 0; i < bugsArr.length; i++) {
            if (i < fieldArr.length){

                int fieldIndexWithBug = Integer.parseInt(bugsArr[i]);

                if (fieldIndexWithBug >= 0 && fieldIndexWithBug < fieldArr.length){

                    fieldArr[fieldIndexWithBug] = "1";

                }
            }
        }



        //System.out.println(Arrays.toString(fieldArr));
        String newCommand = scanner.nextLine().trim();

        int bugPlace = 0;
        String command = "";
        int flyRange = 0;
        String resultStr = "";

        while (!newCommand.equals("end")){

            String[] commandArr = newCommand.split(" ");
            bugPlace = Integer.parseInt(commandArr[0]);
            command = commandArr[1];
            flyRange = Integer.parseInt(commandArr[2]);

            if (bugPlace >= 0 && bugPlace < fieldArr.length && fieldArr[bugPlace].equals("1")){

                if (command.equals("left")){

                    if (flyRange > 0)
                        fieldArr = FlyLeft(bugPlace, command, flyRange, fieldArr);
                    else {
                        flyRange = Math.abs(flyRange);
                        fieldArr = FlyRight(bugPlace, command, flyRange, fieldArr);
                    }

                }else if (command.equals("right")){

                    if (flyRange > 0) fieldArr = FlyRight(bugPlace, command, flyRange, fieldArr);
                    else {

                        flyRange = Math.abs(flyRange);
                        fieldArr = FlyLeft(bugPlace, command, flyRange, fieldArr);
                    }
                }
            }

            newCommand = scanner.nextLine().trim().toLowerCase();
        }

        StringBuilder builder = new StringBuilder();
        for (String value : fieldArr) {
            builder.append(value + " ");
        }
        resultStr = builder.toString();

        System.out.println(resultStr);
    }
    public static String[] FlyRight (int oldPlace, String command, int range, String[] array) {
        int newPlace = oldPlace + range;
        if (newPlace < array.length){
            while (array[newPlace].equals("1")) {
                newPlace += range;
                if (newPlace >= array.length){
                    array[oldPlace] = "0";
                    break;
                }
            }
        }
        if (newPlace >= 0 && newPlace < array.length){
            array[oldPlace] = "0";
            array[newPlace] = "1";
        }else if (newPlace >= array.length){
            array[oldPlace] = "0";
        }
        return array;
    }

    public static String[] FlyLeft (int oldPlace, String command, int range, String[] array) {
        int newPlace = oldPlace - range;
        if (newPlace >= 0){
            while (array[newPlace].equals("1")) {
                newPlace -= range;
                if (newPlace < 0){
                    array[oldPlace] = "0";
                    break;
                }
            }
        }
        if (newPlace >= 0 && newPlace < array.length){
            array[oldPlace] = "0";
            array[newPlace] = "1";
        }else if (newPlace < 0){
            array[oldPlace] = "0";
        }
        return array;
    }
}