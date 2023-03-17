package L2DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        int sum = n1 + n2;
        int div = sum / n3;
        int mult = div * n4;

        System.out.println(mult);
    }
}
