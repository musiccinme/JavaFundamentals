package L4Methods;

import java.util.Scanner;

public class Ex09PalindromeIntegers {
    public static boolean isPalindrome (String number){
        if(number.length() == 1){
            return true;
        }else if(number.length()%2 != 0){
            for(int i=0, j= number.length()-1; i <= number.length()/2 && j >= number.length()/2 + 1; i++, j--){
                if(number.charAt(i) == number.charAt(j)){
                    return true;
                }
            }
        }else {
            for(int i = 0, j = number.length()-1; i <= number.length()/2 - 1 && j >= number.length()/2; i++, j--){
                if(number.charAt(i) == number.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")){
            String num = command;
            System.out.println(isPalindrome(num));

            command = scanner.nextLine();
        }



    }
}
