package L4Methods;

import java.util.Scanner;

public class Ex02VowelsCount {

    public static void printVowelsCount (String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++ ){
            char current = input.charAt(i);
            switch (current) {
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        printVowelsCount(text);
    }
}
