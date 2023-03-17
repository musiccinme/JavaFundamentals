package L7TextProcessing;

import java.util.Scanner;

public class Ex06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder replace = new StringBuilder();

        for(int i = 0; i < input.length()-1; i++){
            if(input.charAt(i) != input.charAt(i+1)){
                replace.append(input.charAt(i));
            }
        }

        replace.append(input.charAt(input.length()-1));

        System.out.println(replace);
    }
}
