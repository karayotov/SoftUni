package L04DataTypesAndVariables.lab;

import java.util.Scanner;

public class p04Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peopleCount = Double.parseDouble(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int)Math.ceil(peopleCount / capacity);

        System.out.println(courses);
    }
}