package L3Arrays;

import java.util.Scanner;

public class Lab04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i <= (input.length-1)/2; i++){
            String x = input[i];
            input[i] =input[input.length-1-i];
            input[input.length-1-i] = x;
        }
        System.out.println(String.join(" ", input));

    }
}
