package L4Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab11MathOperations {
    public static double calculate(int operand1, String operator, int operand2){
        double result = 0.0;

        switch (operator){
            case "*":
                result = operand1 * operand2;
                break;
            case "+":
                result = operand1 + operand2;
                break;
            case "/":
                result = operand1*1.0 / operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        String op = scanner.nextLine();
        int n2 = Integer.parseInt(scanner.nextLine());

        double result = calculate(n1, op, n2);

        System.out.println(new DecimalFormat("0.##").format(result));

    }
}
