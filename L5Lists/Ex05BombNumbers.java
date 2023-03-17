package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> bombAndPower = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bomb = bombAndPower.get(0);
        int power = bombAndPower.get(1);

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == bomb){
                int left = Math.max(0, i - power);
                int right = Math.min(numbers.size() - 1, i + power);

                for (int j = right; j >= left; j--) {
                    numbers.remove(j);
                }

                i = -1;
            }
        }
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }
}
