package L6AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        int toPrint = Math.min(3, numbers.size());
        for (int i = 0; i < toPrint; i++){
            System.out.print(numbers.get(i) + " ");
        }


    }
}
