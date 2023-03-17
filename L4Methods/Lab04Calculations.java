package L4Methods;

import java.util.Scanner;

public class Lab04Calculations {
    public static void printAddition(int n1, int n2){
        int result = n1 + n2;
        System.out.println(result);
    }

    public static void printMultiplication(int n1, int n2){
        int result = n1 * n2;
        System.out.println(result);
    }

    public static void printSubtraction(int n1, int n2){
        int result = n1 - n2;
        System.out.println(result);
    }

    public static void printDivision(int n1, int n2){
        int result = n1 / n2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculationCommand = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if(calculationCommand.equals("add")){
            printAddition(number1, number2);
        }else if (calculationCommand.equals("multiply")){
            printMultiplication(number1, number2);
        }else if(calculationCommand.equals("subtract")){
            printSubtraction(number1, number2);
        }else {
            printDivision(number1, number2);
        }
    }
}
