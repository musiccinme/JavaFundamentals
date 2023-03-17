package MidExam;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfVacation = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int countPeople = Integer.parseInt(scanner.nextLine());
        double priceFuelPerKm = Double.parseDouble(scanner.nextLine());
        double foodExpensesPerPerson = Double.parseDouble(scanner.nextLine());
        double hotelPerNightPerPerson = Double.parseDouble(scanner.nextLine());

        double hotelExpensesTotal = daysOfVacation * countPeople * hotelPerNightPerPerson;
        if(countPeople > 10){
            hotelExpensesTotal = 0.75 * hotelExpensesTotal;
        }

        double totalFoodExpenses = countPeople*daysOfVacation*foodExpensesPerPerson;

        double totalFuelExpenses = 0.0;

        boolean isBudgetEnough = true;

        double currentExpenses = 0.0;
        double additionalExpensesSum = 0.0;
        double withdrawalSum = 0.0;

        for(int i = 1; i <= daysOfVacation; i++){
            double travelledKmPerDay = Double.parseDouble(scanner.nextLine());

            double fuelExpensesPerDay = travelledKmPerDay*priceFuelPerKm;
            totalFuelExpenses += fuelExpensesPerDay;


            currentExpenses = hotelExpensesTotal + totalFoodExpenses + totalFuelExpenses + additionalExpensesSum - withdrawalSum;

            if(i % 3 == 0 || i % 5 == 0){
                double additionalExpenses = 0.4 * currentExpenses;
                additionalExpensesSum += additionalExpenses;
            }
            if(i % 7 == 0){
                double withdrawal = currentExpenses/countPeople;
                withdrawalSum += withdrawal;
            }

            currentExpenses = hotelExpensesTotal + totalFoodExpenses + totalFuelExpenses + additionalExpensesSum - withdrawalSum;

            if(currentExpenses > budget){
                isBudgetEnough = false;
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", currentExpenses-budget);
                break;
            }

        }
        if(isBudgetEnough){
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget-currentExpenses);
        }
    }
}
