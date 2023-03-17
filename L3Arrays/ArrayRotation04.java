package L3Arrays;

import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elem = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            String firstElem = elem[0];
            for (int j = 0; j < elem.length - 1; j++) {
                elem[j] = elem[j+1];
            }
            elem[elem.length-1] = firstElem;
        }

        System.out.println(String.join(" ", elem));
    }
}
