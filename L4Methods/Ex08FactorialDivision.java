package L4Methods;

import java.util.Scanner;

public class Ex08FactorialDivision {
    public static long getFactorial(int n){
        long result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static double getDivision(int n1, int n2){
        return getFactorial(n1)*1.0/getFactorial(n2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", getDivision(num1, num2));
    }
}
