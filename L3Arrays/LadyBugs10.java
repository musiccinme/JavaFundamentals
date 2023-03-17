package L3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        int[] ladybugIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        for(int ladybugIndex : ladybugIndexes){
            if(ladybugIndex >=0 && ladybugIndex < fieldSize){
                field[ladybugIndex] = 1;
            }
        }

        String command = scanner.nextLine();

        while(!command.equals("end")) {
            String[] tokens = command.split(" ");

            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (index >= 0 && index < fieldSize && field[index] == 1) {
                field[index] = 0;

                if (direction.equals("right")) {
                index += flyLength;

                while (index < fieldSize && field[index] == 1) {
                    index += flyLength;
                }
                if (index < fieldSize) {
                    field[index] = 1;
                }
            } else if (direction.equals("left")) {
                    index -= flyLength;

                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int elems : field) {
            System.out.print(elems + " ");
        }
    }
}
