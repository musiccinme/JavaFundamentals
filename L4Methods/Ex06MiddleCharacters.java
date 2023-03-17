package L4Methods;

import java.util.Scanner;

public class Ex06MiddleCharacters {
    public static void printMiddleChar(String input){
        if(input.length()%2 != 0){
            char middle = input.charAt(input.length()/2);
            System.out.println(middle);
        }else {
            char middle1 = input.charAt(input.length()/2 - 1);
            char middle2 = input.charAt(input.length()/2);
            System.out.printf("%c%c", middle1, middle2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromUser = scanner.nextLine();
        printMiddleChar(inputFromUser);
    }
}
