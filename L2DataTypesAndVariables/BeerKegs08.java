package L2DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxKegModel = "";

        for (int kegs = 1; kegs <= countKegs; kegs++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow (radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxKegModel = model;
            }
        }
        System.out.println(maxKegModel);
    }

}
