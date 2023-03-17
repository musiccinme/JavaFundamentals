package L2DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = n; i > 0; i = i/10){
            int digit = i%10;
            sum += digit;
        }
        System.out.println(sum);
    }
}
