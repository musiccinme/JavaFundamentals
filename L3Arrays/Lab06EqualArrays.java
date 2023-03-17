package L3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] array2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int sum = 0;
        boolean areEqual = true;
        for (int i = 0; i<array1.length; i++){
            if (array1[i] == array2[i]){
                sum += array1[i];
            }
            else {
                areEqual = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }

        }
        if (areEqual){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
