package L3Arrays;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] arr1 = firstLine.split(" ");
        String[] arr2 = secondLine.split(" ");

        for (String n : arr1) {
            for (String m : arr2) {
                if (n.equals(m)) {
                    System.out.print(n + " ");
                }
            }
        }

    }
}
