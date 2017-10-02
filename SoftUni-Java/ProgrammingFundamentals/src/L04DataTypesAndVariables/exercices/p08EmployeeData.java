package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p08EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        byte age = Byte.parseByte(scanner.nextLine());
        String gender = scanner.next();

        short personalID = Short.parseShort(scanner.nextLine());

    }
}