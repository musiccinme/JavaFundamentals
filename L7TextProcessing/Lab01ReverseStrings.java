package L7TextProcessing;

import java.util.Scanner;

public class Lab01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String text = input;
            String reversed = "";
            for(int i = 0; i < text.length(); i++){
                reversed += text.charAt(text.length() - 1 - i);
            }
            System.out.println(text + " = " + reversed);
            input = scanner.nextLine();
        }
    }
}
