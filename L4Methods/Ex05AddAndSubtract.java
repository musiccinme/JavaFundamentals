package L4Methods;

import java.util.Scanner;

public class Ex05AddAndSubtract {
    public static int getSum(int number1, int number2){
        return  number1 + number2;
    }
    public static int getSubtraction(int number1, int number2, int number3){
        return getSum(number1, number2) - number3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getSubtraction(num1, num2, num3));
    }
}
