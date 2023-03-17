package L4Methods;

import java.util.Scanner;

public class Ex10TopNumber {
    public static boolean isDivisibleBy8(int n){
        int sum = 0;
        for(int i = n; i > 0; i = i/10){
            int digit = i%10;
            sum += digit;
        }
        if(sum % 8 != 0){
            return false;
        }
        return true;
    }

    public static boolean isOneDigitOdd(int n){
        int count = 0;
        for(int i = n; i > 0; i = i/10){
            int digit = i%10;

            if(digit % 2 != 0){
                count++;
            }
        }
        if(count == 0){
            return false;
        }
        return true;
    }


    public static void printTopNumbers(int n){
        for(int i = 1; i <= n; i++){
            if(isDivisibleBy8(i) && isOneDigitOdd(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printTopNumbers(number);
    }
}
