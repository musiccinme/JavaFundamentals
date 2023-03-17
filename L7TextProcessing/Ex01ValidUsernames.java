package L7TextProcessing;

import java.util.Scanner;

public class Ex01ValidUsernames {
    public static boolean isValid(String username){
        for(int i = 0; i < username.length(); i++){
            char current = username.charAt(i);
            if(!Character.isLetterOrDigit(current) && current != '_' && current != '-'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if(username.length() > 3 && username.length() <= 16 && isValid(username) ){
                System.out.println(username);
            }
        }
    }
}
