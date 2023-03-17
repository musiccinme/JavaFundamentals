package L4Methods;

import java.util.Scanner;

public class Lab10MultiplyEvensByOdds {
    public  static int getSumOfEvens(int n){
        int sum = 0;
        for(int i = n; i>0; i=i/10){
            int digit = i % 10;
            if(digit%2 == 0){
                sum += digit;
            }
        }
        return sum;
    }

    public  static int getSumOfOdds(int n){
        int sum = 0;
        for(int i = n; i>0; i=i/10){
            int digit = i % 10;
            if(digit%2 == 1){
                sum += digit;
            }
        }
        return sum;
    }

    public static int getMultipleOfEvensAndOdds(int inputNumber){
        int evensSum = getSumOfEvens(inputNumber);
        int oddsSum = getSumOfOdds(inputNumber);

        return evensSum*oddsSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(number));
    }
}
