package L4Methods;

import java.util.Scanner;

public class Lab01SignOfInteger {
    public static void printSignOfInteger(int number){
    if (number > 0){
        System.out.printf("The number %d is positive.", number);
     } else if (number == 0){
        System.out.printf("The number %d is zero.", number);
     } else {
        System.out.printf("The number %d is negative", number);
     }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printSignOfInteger(Integer.parseInt(scanner.nextLine()));

    }
}
