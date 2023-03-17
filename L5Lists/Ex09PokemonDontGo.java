package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        int valueOfIndexToRemove = 0;

        while (!distance.isEmpty()){
            int indexToRemove = Integer.parseInt(scanner.nextLine());

            if(indexToRemove >= 0 && indexToRemove < distance.size()) {
                valueOfIndexToRemove = distance.get(indexToRemove);
                sum += valueOfIndexToRemove;
                distance.remove(indexToRemove);

            }else if (indexToRemove < 0){
                indexToRemove = 0;
                valueOfIndexToRemove = distance.get(indexToRemove);
                sum += valueOfIndexToRemove;
                distance.set(indexToRemove, distance.get(distance.size()-1));

            }else if (indexToRemove >= distance.size()){
                indexToRemove = distance.size()-1;
                valueOfIndexToRemove = distance.get(indexToRemove);
                sum += valueOfIndexToRemove;
                distance.set(indexToRemove, distance.get(0));

            }

            for (int i = 0; i < distance.size(); i++) {
                if (distance.get(i) <= valueOfIndexToRemove) {
                    distance.set(i, distance.get(i) + valueOfIndexToRemove);
                }else if(distance.get(i) > valueOfIndexToRemove) {
                    distance.set(i, distance.get(i) - valueOfIndexToRemove);
                }
            }
        }
        System.out.println(sum);
    }
}
