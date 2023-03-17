package L1BasicSynax;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double coinSum = 0.0;

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);

            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                coinSum += coin;
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double price = 0.0;

        while (!product.equals("End")) {

            boolean hasMoney = true;

            switch (product) {
                case "Nuts": price = 2.0;
                   if (coinSum >= price) {
                       coinSum -= price;
                   } else {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                   } break;

                case "Water": price = 0.7;
                    if (coinSum >= price) {
                        coinSum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } break;

                case "Crisps": price = 1.5;
                    if (coinSum >= price) {
                        coinSum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } break;

                case "Soda": price = 0.8;
                    if (coinSum >= price) {
                        coinSum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } break;

                case "Coke": price = 1.0;
                    if (coinSum >= price) {
                        coinSum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } break;


                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;

            }
            if (!hasMoney) {
                product = scanner.nextLine();
                continue;
            }

            System.out.printf("Purchased %s%n", product);

            product = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", coinSum);

    }
}
