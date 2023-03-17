package L6AssociativeArrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> users = new TreeMap<>();
        Map<String, Integer> languages = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")){
            String[] command = input.split("-");
            String name = command[0];
            if(command.length == 3){
                String language = command[1];
                int points = Integer.parseInt(command[2]);
                users.putIfAbsent(name, points);
                if(users.get(name) < points){
                    users.put(name, points);
                }
                languages.putIfAbsent(language, 0);
                languages.put(language, languages.get(language) + 1);
            }else {
                users.remove(name/*, users.get(name)*/);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        users.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
        .forEach(e -> System.out.printf("%s | %d%n", e.getKey(),e.getValue()));
        System.out.println("Submissions:");
        languages.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));
    }
}
