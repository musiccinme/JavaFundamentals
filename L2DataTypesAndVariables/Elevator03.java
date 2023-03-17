package L2DataTypesAndVariables;

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = persons/capacity;

        if (persons % capacity == 0){
            System.out.println(fullCourses);
        } else {
            int totalCourses = fullCourses +1;
            System.out.println(totalCourses);
        }
    }
}
