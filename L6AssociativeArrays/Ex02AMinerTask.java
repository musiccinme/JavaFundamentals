package L6AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Ex02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")){
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(resource, 0);
            resources.put(resource, resources.get(resource)+quantity);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
