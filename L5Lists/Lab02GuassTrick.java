package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab02GuassTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).
                collect(Collectors.toList());

        int length = numbers.size();

        for(int i = 0; i < length /2; i++){
            numbers.set(i, (numbers.get(i) + numbers.get(numbers.size()-1)));
            numbers.remove(numbers.size()-1);
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
