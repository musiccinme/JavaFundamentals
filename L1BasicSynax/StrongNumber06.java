package L1BasicSynax;

import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int mult = 1;
        int factor = 0;

        for (int i = number; i > 0; i = i/10) {
            factor = i%10;
            for (int j = factor; j > 0; j--) {

                mult *= j;
            }
            sum += mult;
            mult = 1;
        }

        if (sum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
