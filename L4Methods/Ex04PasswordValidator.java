package L4Methods;

import java.util.Scanner;

public class Ex04PasswordValidator {
    public static boolean areEnoughCharacters(String password){
        if(!(password.length() >= 6 && password.length() <= 10)){
            return false;
        }
        return true;
    }

    public static boolean areOnlyLettersAndDigits(String password){
        for(int i = 0; i < password.length(); i++){
            char currentChar = password.charAt(i);
            boolean isSmallLetter = currentChar >= 97 && currentChar <= 122;
            boolean isCapitalLetter = currentChar >= 65 && currentChar <= 90;
            boolean isDigit = currentChar >= 48 && currentChar <= 57;

            if(!isSmallLetter && !isCapitalLetter && !isDigit){
                return false;
            }

        }
        return true;
    }

    public static boolean are2Digits(String password){
        int digitCounter = 0;
        for(int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if(currentChar >= 48 && currentChar <= 57){
                digitCounter++;
            }
        }
        if(digitCounter < 2){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if(!areEnoughCharacters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!areOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!are2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }
        if(areEnoughCharacters(password) && areOnlyLettersAndDigits(password) && are2Digits(password)){
            System.out.println("Password is valid");
        }

    }
}
