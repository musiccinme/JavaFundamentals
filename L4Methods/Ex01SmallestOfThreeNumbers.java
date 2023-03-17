package L4Methods;

import java.util.Scanner;

public class Ex01SmallestOfThreeNumbers {

    public static int compareInt (int first, int second, int third) {
        int smallest = first;
        if(smallest > second) {
            smallest = second;
        }
        if (smallest > third) {
            smallest = third;
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(compareInt(num1, num2, num3));
    }
}
