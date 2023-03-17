package L3Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Lab03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int sum = 0;

        for(int i = 0; i <= numbers.length-1; i++){
            if (numbers[i]%2 ==0){
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
