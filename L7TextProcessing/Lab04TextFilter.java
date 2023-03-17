package L7TextProcessing;

import java.util.Scanner;

public class Lab04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        int n = bannedWords.length;

        for (int i = 0; i < n; i++){
            String replacement = "";

            for(int j = 0; j < bannedWords[i].length(); j++){
                replacement += "*";
            }
            text = text.replace(bannedWords[i], replacement);
        }

        System.out.println(text);
    }
}
