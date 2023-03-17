package L7TextProcessing;

import java.util.Scanner;

public class Ex03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("\\\\");

        String[] file = path[path.length-1].split("\\.");

        String name = file[0];
        String extension = file[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
