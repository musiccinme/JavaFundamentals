package L4Methods;

import java.util.Scanner;

public class Lab05Orders {
    public static void printTotalPrice(String order, int quantity){
        double price = 0.0;

        switch (order){
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        double totalPrice = price*quantity;
        System.out.printf("%.2f", totalPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int numberOfItems = Integer.parseInt(scanner.nextLine());

        printTotalPrice(product, numberOfItems);
    }
}
