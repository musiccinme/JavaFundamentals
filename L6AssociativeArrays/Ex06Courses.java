package L6AssociativeArrays;

import java.util.*;

public class Ex06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] courseStudent = input.split(" : ");
            String course = courseStudent[0];
            String name = courseStudent[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(name);

            input = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("-- " + student));

                });
    }
}
