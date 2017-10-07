package L04DataTypesAndVariables.exercices;

import java.math.BigInteger;
import java.util.Scanner;

public class p08EmployeeData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        byte age = Byte.parseByte(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        long personalID = Long.parseLong(scanner.nextLine());
        int employeeNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("First name: %s%n", firstName);
        System.out.printf("Last name: %s%n", lastName);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Gender: %s%n", gender);
        System.out.printf("Personal ID: %d%n", personalID);
        System.out.printf("Unique Employee number: %d", employeeNum);

    }
}