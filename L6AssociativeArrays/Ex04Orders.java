package L6AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> namePrice = new LinkedHashMap<>();
        Map<String, Integer> nameQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String[] products = input.split(" ");
            String name = products[0];
            double price = Double.parseDouble(products[1]);
            int quantity = Integer.parseInt(products[2]);

            namePrice.putIfAbsent(name, price);
            namePrice.put(name, price);

            nameQuantity.putIfAbsent(name, 0);
            nameQuantity.put(name, nameQuantity.get(name) + quantity);

            input = scanner.nextLine();
        }
        namePrice.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v*nameQuantity.get(k)));

    }
}
