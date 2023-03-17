package L7TextProcessing;

import java.util.Scanner;

public class Lab03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        int n = text2.indexOf(text1);

        while (n != -1){
            text2 = text2.replace(text1, "");
            n = text2.indexOf(text1);
        }
        System.out.println(text2);


    }
}
