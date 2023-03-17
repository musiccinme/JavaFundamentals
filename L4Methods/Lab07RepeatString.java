package L4Methods;

import java.util.Scanner;

public class Lab07RepeatString {
    public static String repeatString (String input, int repeatTimes){
        String repeatedString = "";

        for(int i = 1; i <= repeatTimes; i++){
            repeatedString += input;
        }
        return repeatedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        String newString = repeatString(input, repeat);
        System.out.println(newString);
    }
}
