package L6AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> synonyms = new LinkedHashMap<>();

        for(int i = 1; i<=n; i++){
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            synonyms.putIfAbsent(key, new ArrayList<>());
            synonyms.get(key).add(value);
        }
        for (Map.Entry <String, ArrayList<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
