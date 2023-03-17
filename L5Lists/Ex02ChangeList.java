package L5Lists;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;


public class Ex02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");

            if(command[0].equals("Delete")){
                numbers.removeIf(n -> n == Integer.parseInt(command[1]));
                /*Same as:
                for(int i = 0; i < numbers.size(); i++){
                    if(numbers.get(i) == Integer.parseInt(command[1])){
                        numbers.remove(numbers.get(i));
                        i = -1;
                    }
                } */
            }else {
                numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));



        /*//[3,4,5,6]
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            //"Delete {element}" -> split -> ["Delete", "5"]
            //"Insert {element} {position}" -> ["Insert", "5", "3"]
            String command = input.split("\\s+")[0]; //Delete или Insert
            int element = Integer.parseInt(input.split("\\s+")[1]);

            if (command.equals("Delete")) {
                numbers.removeAll(Arrays.asList(element));
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split("\\s+")[2]);
                numbers.add(index, element);
            }
            input = scanner.nextLine();
        }

        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        } */


    }
}
