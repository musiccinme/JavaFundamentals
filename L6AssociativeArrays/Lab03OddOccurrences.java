package L6AssociativeArrays;

import java.util.*;

public class Lab03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> count = new LinkedHashMap<>();

        for(int i = 0; i < words.length; i++){
            String currentWord = words[i].toLowerCase();
            count.putIfAbsent(currentWord, 0);
            count.put(currentWord, count.get(currentWord)+1);
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if(entry.getValue()%2 != 0){
                odds.add(entry.getKey());
            }
        }
        System.out.println(odds.toString().replaceAll("[\\[\\]]", ""));
    }
}
