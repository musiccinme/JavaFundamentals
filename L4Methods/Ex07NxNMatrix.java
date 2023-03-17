package L4Methods;

import java.util.Scanner;

public class Ex07NxNMatrix {
    public static void printMatrix(int number){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        printMatrix(num);
    }
}
