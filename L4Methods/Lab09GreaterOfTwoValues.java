package L4Methods;

import java.util.Scanner;

public class Lab09GreaterOfTwoValues {
    public static int getMax(int first, int second){
        if(first>second){
            return first;
        }
        return second;
    }

    public static char getMax(char first, char second){
        if(first>second){
            return first;
        }
        return second;
    }

    public static String getMax(String first, String second){
        if(first.compareTo(second)>=0){
            return first;
        }
        return second;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if(type.equals("int")){
            int input1 = Integer.parseInt(scanner.nextLine());
            int input2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(input1, input2));
        }else if(type.equals("char")){
            char input1 = scanner.nextLine().charAt(0);
            char input2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(input1,input2));
        }else if(type.equals("string")){
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            System.out.println(getMax(input1,input2));
        }
    }
}
