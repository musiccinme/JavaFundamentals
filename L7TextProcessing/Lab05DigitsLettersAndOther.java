package L7TextProcessing;

import java.util.Scanner;

public class Lab05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if(Character.isDigit(current)){
                System.out.print(current);
            }
        }
        System.out.println();

        for (int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if(Character.isAlphabetic(current)){
                System.out.print(current);
            }
        }
        System.out.println();

        for (int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if(!Character.isLetterOrDigit(current)){
                System.out.print(current);
            }
        }
        System.out.println();
    }
}
