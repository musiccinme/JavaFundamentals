package L4Methods;

import java.util.Scanner;

public class Lab03PrintingTriangle {
    public static void printLine(int start, int end) {
        for(int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= number; i++){
            printLine(1, i);
        }

        //printLine(1, number);

        for(int i = number - 1; i >= 1; i--){
            printLine(1, i);
        }
    }
}
