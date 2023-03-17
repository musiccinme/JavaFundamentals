package L7TextProcessing;

import java.util.Scanner;

public class Ex09LettersChangeNumbers {
    public static double getValue(String input){
        char firstLetter = input.charAt(0);
        char lastLetter = input.charAt(input.length()-1);
        double number = Double.parseDouble(input.substring(1, input.length()-1));

        if(Character.isUpperCase(firstLetter)){
            number /= (firstLetter-64);
        }else {
            number *= (firstLetter-96);
        }

        if(Character.isUpperCase(lastLetter)){
            number -= (lastLetter-64);
        }else {
            number += (lastLetter-96);
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;

        for(int i = 0; i < input.length; i++){
            sum += getValue(input[i]);
        }
        System.out.printf("%.2f", sum);
    }
}
