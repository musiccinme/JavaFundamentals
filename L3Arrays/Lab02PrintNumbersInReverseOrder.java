package L3Arrays;

import java.util.Scanner;

public class Lab02PrintNumbersInReverseOrder {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int input = Integer.parseInt(scanner.nextLine());

    int[] numbers = new int[input];

    for(int i = 0; i<input; i++) {
        numbers[i] = Integer.parseInt(scanner.nextLine());
    }
    for (int i = numbers.length-1; i>=0; i--){
        System.out.print(numbers[i] + " ");
    }

  }

}
