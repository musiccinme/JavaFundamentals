package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("End")){
            String[] command = input.split("\\s+");

            if(command[0].equals("Add")){
                numbers.add(Integer.parseInt(command[1]));
            }else if(command[0].equals("Insert")){
                if(Integer.parseInt(command[2]) < numbers.size() && Integer.parseInt(command[2]) >= 0) {
                    numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                }else {
                    System.out.println("Invalid index");
                }
            }else if(command[0].equals("Remove")){
                if(Integer.parseInt(command[1]) < numbers.size() && Integer.parseInt(command[1]) >= 0) {
                    numbers.remove(Integer.parseInt(command[1]));
                }else {
                    System.out.println("Invalid index");
                }
            }else if(command[0].equals("Shift") && command[1].equals("left")){
                int count = Integer.parseInt(command[2]);
                for(int i = count; i > 0; i--){
                    numbers.add(numbers.get(0));
                    numbers.remove(0);
                }
            }else if(command[0].equals("Shift") && command[1].equals("right")){
                int count = Integer.parseInt(command[2]);
                for(int i = count; i > 0; i--){
                    numbers.add(0, numbers.get(numbers.size()-1));
                    numbers.remove(numbers.size()-1);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
