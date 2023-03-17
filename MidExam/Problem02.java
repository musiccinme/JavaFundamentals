package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffeeInStock = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        while(n>0){
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]){
                case "Include":
                    coffeeInStock.add(command[1]);
                    break;

                case "Remove":
                    int number = Integer.parseInt(command[2]);
                    if(number < coffeeInStock.size()) {
                        for(int j = 1; j<=number; j++){
                            if (command[1].equals("first")) {
                                coffeeInStock.remove(0);
                            }else {
                                coffeeInStock.remove(coffeeInStock.size()-1);
                            }
                        }
                    }
                    break;

                case "Prefer":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    if(index1 >= 0 && index1 < coffeeInStock.size() && index2 >= 0 && index2 < coffeeInStock.size()) {
                        String coffeeAtIndex1 = coffeeInStock.get(index1);
                        String coffeeAtIndex2 = coffeeInStock.get(index2);

                        coffeeInStock.set(index1, coffeeAtIndex2);
                        coffeeInStock.set(index2, coffeeAtIndex1);
                    }
                    break;

                case "Reverse":
                    Collections.reverse(coffeeInStock);
                    break;
            }
            n--;
        }
        System.out.println("Coffees:");
        System.out.println(coffeeInStock.toString().replaceAll("[\\[\\],]", ""));
    }
}
