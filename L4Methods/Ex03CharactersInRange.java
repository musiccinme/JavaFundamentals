package L4Methods;

import java.util.Scanner;

public class Ex03CharactersInRange {
    public static void printCharactersBetween(char c1, char c2){
        if(c1 < c2){
            for(int i = c1+1; i < c2; i++){
                System.out.print((char)i + " ");
            }
        }else {
            for(int i = c2+1; i < c1; i++){
                System.out.print((char)i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printCharactersBetween(first, second);
    }

}
