package L3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft += array[j];
            }
            for (int l = i + 1; l < array.length; l++) {
                sumRight += array[l];
            }
            if (sumLeft == sumRight) {
                isFound = true;
                System.out.println(i);
            }
        }
        if (!isFound) {
            System.out.println("no");
        }

    }
}
