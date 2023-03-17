package L7TextProcessing;

import java.util.Scanner;

public class Lab02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String repeated = "";

        for(int i = 0; i < input.length; i++){
            int n = input[i].length();
            for(int j = 1; j <= n; j++){
                repeated += input[i];
            }
        }
        System.out.println(repeated);
    }
}
