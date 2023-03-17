package L3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int count = 1;
        int max = Integer.MIN_VALUE;

        int indexStart = 0;
        int bestIndex = 0;

       /* for (int i = 1; i < ints.length; i++) {
            if (ints[i] == ints[i-1]) {
                count++;
            } else {
                indexStart = i;
                count = 1;
            }

            if(max<count) {
                max = count;
                bestIndex = indexStart;
            }
        }

        for (int i = bestIndex; i < bestIndex + max; i++) {
            System.out.print(ints[i] + " ");
        } */




        for(int i = 0; i < ints.length-1; i++) {
            if (ints[i] == ints[i+1]) {
                count++;
            } else {
                count = 1;
                indexStart = i+1;
                }
            if (max < count) {
                max = count;
                bestIndex = indexStart;
            }

        }

        for (int i = bestIndex; i < bestIndex + max; i++){
            System.out.print(ints[i] + " ");
        }



        /*int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int maxLength = 0;
        int length = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }

            if(length > maxLength) {
                maxLength = length;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(array[i] + " ");
        } */

    }
}
