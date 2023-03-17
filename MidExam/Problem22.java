package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] command = input.split(" ");

            switch (command[0]){
                case "add":
                    if(command[2].equals("start")){
                        int intsToAdd = command.length - 3;
                        for(int i = command.length-1; i >= command.length - intsToAdd; i--){
                            int intToAdd = Integer.parseInt(command[i]);
                            list.add(0, intToAdd);
                        }
                    }else {
                        int intsToAdd = command.length - 3;
                        for(int i = command.length - intsToAdd; i < command.length; i++){
                            int intToAdd = Integer.parseInt(command[i]);
                            list.add(intToAdd);
                        }
                    }
                    break;

                case "remove":
                    if(command[1].equals("lower")){
                        int value = Integer.parseInt(command[3]);
                        for(int i = 0; i < list.size(); i++){
                            if(list.get(i) < value){
                                list.remove(list.get(i));
                                i=-1;
                            }
                        }
                    }else if(command[1].equals("greater")){
                        int value = Integer.parseInt(command[3]);
                        for(int i = 0; i < list.size(); i++){
                            if(list.get(i) > value){
                                list.remove(list.get(i));
                                i=-1;
                            }
                        }
                    }else if(command[1].equals("at")){
                        int index = Integer.parseInt(command[3]);
                        if(index>=0 && index<list.size()){
                            list.remove(list.get(index));
                        }
                    }else {
                        int count = Math.min(list.size(), Integer.parseInt(command[2]));

                        for (int i = 1; i <= count; i++){
                            list.remove(list.size()-1);
                        }
                    }
                    break;

                case "replace":
                    int value = Integer.parseInt(command[1]);
                    int replacement = Integer.parseInt(command[2]);

                    for(int i = 0; i < list.size(); i++){
                        if(list.get(i) == value){
                            list.set(i, replacement);
                            break;
                        }
                    }

                    break;

                case "find":
                    if(command[1].equals("even")){
                        for (int i = 0; i < list.size(); i++){
                            if(list.get(i)%2 == 0){
                                System.out.print(list.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < list.size(); i++){
                            if(list.get(i)%2 != 0){
                                System.out.print(list.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));
    }
}
