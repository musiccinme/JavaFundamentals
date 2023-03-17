package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i++){
            String[] command = scanner.nextLine().split(", ");

            switch (command[0]){
                case "Add":
                    String cardName = command[1];
                    if(cards.contains(cardName)){
                        System.out.println("Card is already in the deck");
                    }else {
                        cards.add(cardName);
                        System.out.println("Card successfully added");
                    }
                    break;

                case "Remove":
                    cardName = command[1];
                    if(cards.contains(cardName)){
                        cards.remove(cardName);
                        System.out.println("Card successfully removed");
                    }else {
                        System.out.println("Card not found");
                    }
                    break;

                case "Remove At":
                    int index = Integer.parseInt(command[1]);
                    if(index >= 0 && index < cards.size()){
                        cards.remove(index);
                        System.out.println("Card successfully removed");
                    }else {
                        System.out.println("Index out of range");
                    }
                    break;

                case "Insert":
                    index = Integer.parseInt(command[1]);
                    cardName = command[2];

                    if(index >= 0 && index < cards.size()){
                        if(cards.contains(cardName)){
                            System.out.println("Card is already added");
                        }else {
                            cards.add(index, cardName);
                            System.out.println("Card successfully added");
                        }
                    }else {
                        System.out.println("Index out of range");
                    }
                    break;
            }

        }
        System.out.println(cards.toString().replaceAll("[\\[\\]]", ""));


    }
}
