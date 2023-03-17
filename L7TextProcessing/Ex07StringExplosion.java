package L7TextProcessing;

import java.util.Scanner;

public class Ex07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        int power = 0;

        for(int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if(current == '>'){
                power += Integer.parseInt(String.valueOf(input.charAt(i+1)));
            }
            if(power > 0 && current != '>'){
                input.deleteCharAt(i);
                power--;
                i--;
            }
        }
        System.out.println(input);
    }
}
