package L6AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for(int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            if(currentChar == ' '){
                continue;
            }
            occurrences.putIfAbsent(currentChar, 0);
            occurrences.put(currentChar, occurrences.get(currentChar) + 1);
        }

        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
