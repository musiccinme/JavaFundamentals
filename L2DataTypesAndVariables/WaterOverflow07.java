package L2DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int limit = 255;
        for (int i = 0; i < numLines; i++) {
            int quantityWater = Integer.parseInt(scanner.nextLine());
            if (sum + quantityWater <= limit) {
                sum += quantityWater;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
