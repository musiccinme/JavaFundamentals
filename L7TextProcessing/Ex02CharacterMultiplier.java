package L7TextProcessing;

import java.util.Scanner;

public class Ex02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");

        String first = strings[0];
        String second = strings[1];

        int minLength = Math.min(first.length(), second.length());
        int totalSum = 0;

        for(int i = 0; i < minLength; i++){
            totalSum += (int)first.charAt(i) * (int)second.charAt(i);
        }
        if(first.length() > second.length()){
            for (int i = second.length(); i < first.length(); i++){
                totalSum += first.charAt(i);
            }
        }else if (first.length() < second.length()){
            for (int i = first.length(); i < second.length(); i++){
                totalSum += second.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
