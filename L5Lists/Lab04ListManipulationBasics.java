package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");

            if(command[0].equals("Add")){
                numbers.add(Integer.parseInt(command[1]));
            }else if(command[0].equals("Remove")){
                numbers.remove(Integer.valueOf(Integer.parseInt(command[1])));
            }else if(command[0].equals("RemoveAt")){
                numbers.remove(Integer.parseInt(command[1]));
            }else if(command[0].equals("Insert")){
                numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
