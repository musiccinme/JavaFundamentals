package L2DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = n; i > 0; i--){
            char ch = scanner.next().charAt(0);
            sum += (int) ch;
        }
        System.out.println("The sum equals: " + sum);
    }
}
