package L6AssociativeArrays;

import java.util.*;

public class Ex09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> sides = new TreeMap<>();
        List<String> allUsers = new ArrayList<>();

        while (!input.equals("Lumpawaroo")){
            String[] command;
            if(input.contains(" | ")){
                command = input.split(" \\| ");
                String forceSide = command[0];
                String forceUser = command[1];

                sides.putIfAbsent(forceSide, new ArrayList<>());

                if(!allUsers.contains(forceUser)){
                    allUsers.add(forceUser);
                    sides.get(forceSide).add(forceUser);
                }
            }else if(input.contains(" -> ")) {
                command = input.split(" -> ");
                String forceSide = command[1];
                String forceUser = command[0];

                for (Map.Entry<String, List<String>> entry : sides.entrySet()) {
                    if(entry.getValue().contains(forceUser)){
                        sides.get(entry.getKey()).remove(forceUser);
                    }
                }
                sides.putIfAbsent(forceSide, new ArrayList<>());
                sides.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }
        sides.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    if(e.getValue().size() != 0) {
                        System.out.printf("Side: %s, Members: %s%n", e.getKey(), e.getValue().size());
                        e.getValue().stream().sorted(String::compareTo)
                                .forEach(a -> System.out.printf("! %s%n", a));
                    }
                });
    }
}
