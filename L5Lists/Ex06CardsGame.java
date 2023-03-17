package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> deck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> deck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (deck1.size() > 0 && deck2.size() > 0) {
            int length = Math.min(deck1.size(), deck2.size());
            for (int i = 0; i < length; i++) {
                if (deck1.get(0) > deck2.get(0)) {
                    deck1.add(deck1.get(0));
                    deck1.add(deck2.get(0));
                    deck1.remove(deck1.get(0));
                    deck2.remove(deck2.get(0));
                } else if (deck1.get(0) < deck2.get(0)) {
                    deck2.add(deck2.get(0));
                    deck2.add(deck1.get(0));
                    deck2.remove(deck2.get(0));
                    deck1.remove(deck1.get(0));
                } else if (deck1.get(0).equals(deck2.get(0))) {
                    deck1.remove(deck1.get(0));
                    deck2.remove(deck2.get(0));
                }
            }
        }

        int sum = 0;
        if(deck1.size() > deck2.size()){
            for(int card : deck1){
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }else {
            for(int card : deck2){
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }
}
