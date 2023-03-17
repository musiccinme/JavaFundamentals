package L3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i <= array.length-1; i++) {

            if (i == array.length-1) {
                System.out.print(array[i]);
                break;
            }
            boolean isBigger = false;
            for (int j = i+1; j <= array.length - 1; j++) {

                if (array[i] > array[j]) {
                     isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger == true) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
