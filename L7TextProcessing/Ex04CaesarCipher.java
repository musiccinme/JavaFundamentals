package L7TextProcessing;

import java.util.Scanner;

public class Ex04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder cipher = new StringBuilder();

        for(int i = 0; i < input.length(); i++){
            int charCode = (int)input.charAt(i) + 3;
            char charToAdd = (char) charCode;

            cipher.append(charToAdd);
        }
        System.out.println(cipher);
    }

}
