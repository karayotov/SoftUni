package ExamPrepare02.Progr_Fund_Extended_Retake_Exam_04_Sept_2017_Part_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class p02_Icarus_SecondTry {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] planeStrArr = bufferedReader.readLine().split("\\s+");

        int[] plane = Stream.of(planeStrArr).mapToInt(Integer::parseInt).toArray();

        int index = Integer.parseInt(bufferedReader.readLine());

        String commandStr = bufferedReader.readLine();

        String turn;

        int steps;

        int damage = 1;

        while (!commandStr.equals("Supernova")){

            String[] commandArr = commandStr.split(" ");

            turn = commandArr[0];
            steps = Integer.parseInt(commandArr[1]);

            switch (turn){
                case "left":

                    for (int i = 0; i < steps; i++) {

                        index--;

                        if (index < 0){
                            index = plane.length - 1;
                            damage++;
                        }
                        plane[index] -= damage;
                    }
                    break;
                case "right":

                    for (int i = 0; i < steps; i++) {

                        index++;

                        if (index > plane.length - 1){
                            index = 0;
                            damage++;
                        }
                        plane[index] -= damage;
                    }

                    break;
                    default:
                        break;

            }
            commandStr = bufferedReader.readLine();
        }

        String planeStr = Arrays
                .toString(plane)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
        System.out.println(planeStr);
    }
}
