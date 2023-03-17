package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPreparation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShipStatus= Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warshipStatus= Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean hasSunken = false;

        while (!input.equals("Retire")){
            String[] command = input.split(" ");

            switch (command[0]){
                case "Fire":
                    int index = Integer.parseInt(command[1]);

                    if(index >= 0 && index < warshipStatus.size()){
                        int damage = Integer.parseInt(command[2]);
                        warshipStatus.set(index, warshipStatus.get(index) - damage);

                        if(warshipStatus.get(index) <= 0){
                            System.out.println("You won! The enemy ship has sunken.");
                            hasSunken = true;
                        }
                    }

                    break;

                case "Defend":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    int damage = Integer.parseInt(command[3]);

                    if(startIndex >= 0 && endIndex < pirateShipStatus.size()){
                        for(int i = startIndex; i <= endIndex; i++){
                            pirateShipStatus.set(i, pirateShipStatus.get(i) - damage);

                            if(pirateShipStatus.get(i) <= 0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                hasSunken = true;
                                break;
                            }
                        }
                    }

                    break;

                case "Repair":
                    index = Integer.parseInt(command[1]);
                    int health = Integer.parseInt(command[2]);

                    if(index >= 0 && index < pirateShipStatus.size()){
                        int sectionHealth = Math.min(maxHealth, health + pirateShipStatus.get(index));
                        pirateShipStatus.set(index, sectionHealth);
                    }
                    break;

                case "Status":
                    int count = 0;
                    double percentage = 0.2*maxHealth;

                    for(int i = 0; i < pirateShipStatus.size(); i++){
                        if(pirateShipStatus.get(i) < percentage){
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }

            if(hasSunken){
                break;
            }

            input = scanner.nextLine();
        }

        if(!hasSunken){
            int pirateShipSum = 0;
            for(int i = 0; i < pirateShipStatus.size(); i++){
                int section = pirateShipStatus.get(i);
                pirateShipSum += section;
            }
            int warshipSum = 0;
            for(int i = 0; i < warshipStatus.size(); i++){
                int section = warshipStatus.get(i);
                warshipSum += section;
            }

            System.out.println("Pirate ship status: " + pirateShipSum);
            System.out.println("Warship status: " + warshipSum);

        }


    }
}
