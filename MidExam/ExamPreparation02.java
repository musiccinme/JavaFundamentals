package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class ExamPreparation02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")){
            String[] command = input.split(" ");

            switch (command[0]){
                case "Loot":
                    int itemsToAdd = command.length;

                    for(int i = 1; i < itemsToAdd; i++){
                        if(!loot.contains(command[i])){
                            loot.add(0, command[i]);
                        }
                    }
                    //System.out.println(loot.toString().replaceAll("[\\[\\],]", ""));
                    break;

                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if(index >= 0 && index < loot.size()){
                        String lootToAdd = loot.get(index);
                        loot.remove(index);
                        loot.add(lootToAdd);
                    }
                    //System.out.println(loot.toString().replaceAll("[\\[\\],]", ""));
                    break;

                case "Steal":
                    int count = Integer.parseInt(command[1]);
                    int itemsToSteal = Math.min(count, loot.size());
                    List<String> stolen = new ArrayList<>();

                    for(int i = 0; i < itemsToSteal; i++){
                        String itemToPrint = loot.get(loot.size()-1);
                        loot.remove(loot.size()-1);
                        stolen.add(itemToPrint);
                    }
                    Collections.reverse(stolen);
                    System.out.println(stolen.toString().replaceAll("[\\[\\]]", ""));
                    //System.out.println(loot.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }

            input = scanner.nextLine();
        }
        if(loot.size() > 0) {
            int lengthSum = 0;
            for (int i = 0; i < loot.size(); i++) {
                String currentItem = loot.get(i);
                int currentItemLength = currentItem.length();
                lengthSum += currentItemLength;
            }
            double averageGain = lengthSum * 1.0 / loot.size();

            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }


    }
}
