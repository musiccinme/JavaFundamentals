package L1BasicSynax;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String actualPass = "";

        for (int i = username.length()-1; i >= 0; i-- ) {
            char currentSymbol = username.charAt(i);
            actualPass += currentSymbol;
        }
        int count = 0;

        while (!password.equals(actualPass)){
            count ++;
            if (count == 4) {
                System.out.printf("User %s blocked!%n", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }
        if (password.equals(actualPass)) {
            System.out.printf("User %s logged in.%n", username);
        }
    }
}
