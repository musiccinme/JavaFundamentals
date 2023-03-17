package FinalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> letters = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        //String input = scanner.nextLine();
        boolean isPlaytime = false;

        while (!isPlaytime) {
            String input = scanner.nextLine();
            String[] command = input.split(" ");

            if (command[0].equals("Move") && command.length == 2) {
                int index = Integer.parseInt(command[1]);

                if (index >= 0 && index < letters.size()) {
                    String letterToMove = letters.get(index);
                    letters.add(letterToMove);
                    letters.remove(index);
                }
            } else if (command[0].equals("Insert") && command[1].equals("Space") && command.length == 3) {

                int index = Integer.parseInt(command[1]);
                letters.add(index, " ");
            }else if(command[0].equals("Reverse") && command.length == 2) {

                StringBuilder builder = new StringBuilder();
                for (String letter : letters) {
                    builder.append(letter);
                }
                String current = builder.toString();
                String substring = command[1];
                //String reversed = "";
                if (current.contains(substring)) {
                    int firstIndex = current.indexOf(substring);
                    int lastIndex = firstIndex + substring.length();
                    int count = 0;
                    for (int i = lastIndex-1; i >= firstIndex; i--) {
                        //letters.remove(letters.get(lastIndex - 1 - count));
                        //count++;
                        letters.add(String.valueOf(current.charAt(i)));
                        letters.remove(i);
                        }
                    }

            } else if(command[0].equals("Exchange") && command[1].equals("Tiles") && command.length == 3) {

                    List<String> newLetters = Arrays.stream(command[2].split("")).collect(Collectors.toList());
                    int min = Math.min(newLetters.size(), letters.size());
                    for (int i = 0; i < min; i++) {
                        letters.set(i, newLetters.get(i));
                    }
                    System.out.println(letters.toString().replaceAll("[\\[\\],]", ""));

                    isPlaytime = true;
            }else if(command[0].equals("Pass") && command.length == 1) {

                    System.out.println(letters.toString().replaceAll("[\\[\\],]", ""));
                    isPlaytime = true;
            }else if(command[0].equals("Play") && command.length == 1) {

                    if (letters.contains(" ")) {
                        StringBuilder builder = new StringBuilder();
                        for (String letter : letters) {
                            builder.append(letter);
                        }
                        String current = builder.toString();
                        int index = current.indexOf(" ");
                        String extract = current.substring(0, index);
                        System.out.printf("You are playing with the word %s.%n", extract);
                    } else {
                        StringBuilder builder = new StringBuilder();
                        for (String letter : letters) {
                            builder.append(letter);
                        }
                        String current = builder.toString();
                        System.out.printf("You are playing with the word %s.%n", current);
                    }
                    isPlaytime = true;
            }
            }

        }

}
