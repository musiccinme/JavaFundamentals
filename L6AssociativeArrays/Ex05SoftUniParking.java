package L6AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> user = new LinkedHashMap<>();

        for(int i = 1; i <= n; i++){
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]){
                case "register":
                    String username = command[1];
                    String licencePlate = command[2];
                    if(user.containsKey(username)){
                        System.out.println("ERROR: already registered with plate number " + user.get(username));
                    }else {
                        user.put(username, licencePlate);
                        System.out.printf("%s registered %s successfully%n", username, licencePlate);
                    }
                    break;

                case "unregister":
                    username = command[1];
                    if(!user.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n", username);
                    }else {
                        user.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        user.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
