package L6AssociativeArrays;

import java.util.*;

public class Ex07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> grades = new HashMap<>();

        for (int i = 1; i <= n; i++){
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            grades.putIfAbsent(name, grade);
            if (grades.containsKey(name)) {
                double average = (grades.get(name) + grade)/2;
                grades.put(name, average);
            }
        }

        grades.entrySet().stream().filter(e -> e.getValue() >= 4.5)
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));

    }
}
