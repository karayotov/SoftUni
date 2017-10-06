package L04DataTypesAndVariables.exercices;

import java.util.Scanner;

public class p08EmployeeData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        byte age = Byte.parseByte(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        short personalID = Short.parseShort(scanner.nextLine());
        short employeeNum = Short.parseShort(scanner.nextLine());

        System.out.printf("First name: %s", tName);
        System.out.printf("Last name: %s", lastName);
        System.out.printf("Age %d", age);
        System.out.printf("Gender: %s", gender);
        System.out.printf("Personal ID: %d", personalID);
        System.out.printf("Unique Employee number: %d", employeeNum);



    }
}