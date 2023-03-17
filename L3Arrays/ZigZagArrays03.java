package L3Arrays;

import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String firstElem = input[0];
            String secondElem = input[1];

            if ((i+1) % 2 == 0) {
                array1[i] = secondElem;
                array2[i] = firstElem;
            } else {
                array1[i] = firstElem;
                array2[i] = secondElem;
            }
        }
        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));
    }
}
