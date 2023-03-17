package MidExam;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0.0;

        for(int i = 1; i <= numberOfCities; i++){

            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            //double currentProfit = income - expenses;

            if(i%3 == 0 && i%5 != 0){
                expenses = 1.5 * expenses;
            }
            if(i%5 == 0){
                income = 0.9 * income;
            }
            double currentProfit = income - expenses;
            totalProfit += currentProfit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, currentProfit);

        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
