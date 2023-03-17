package L1BasicSynax;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        if (groupType.equals("Students")) {
            if (day.equals("Friday")){
                price = group * 8.45;
            } else if (day.equals("Saturday")){
                price = group * 9.80;
            } else if (day.equals("Sunday")){
                price = group * 10.46;
            }
            if (group >= 30) {
                price = price * 0.85;
            }
        } else if (groupType.equals("Business")) {
            if (day.equals("Friday")){
                price = 10.90 * group;
            } else if (day.equals("Saturday")){
                price = 15.60 * group;
            } else if (day.equals("Sunday")){
                price = 16 * group;
            }
            if (group >= 100) {
                price = price/group;
                group = group -10;
                price = price * group;
            }
        } else if (groupType.equals("Regular")) {
            if (day.equals("Friday")){
                price = group * 15;
            } else if (day.equals("Saturday")){
                price = group * 20;
            } else if (day.equals("Sunday")){
                price = group * 22.50;
            }
            if (group >= 10 && group <= 20) {
                price = price * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
