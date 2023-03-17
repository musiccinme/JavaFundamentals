package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> bookShelf = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Done")){
            String[] tokens = input.split(" \\| ");
            String command = tokens[0];
            String book = tokens[1];

            switch (command){
                case "Add Book":
                    if(!bookShelf.contains(book)){
                        bookShelf.add(0, book);
                    }
                    break;

                case "Take Book":
                    if(bookShelf.contains(book)){
                        bookShelf.remove(book);
                    }
                    break;

                case "Swap Books":
                    String book2 = tokens[2];

                    if(bookShelf.contains(book) && bookShelf.contains(book2)){
                        int index1 = bookShelf.indexOf(book);
                        int index2 = bookShelf.indexOf(book2);

                        bookShelf.set(index1, book2);
                        bookShelf.set(index2, book);
                    }
                    break;

                case "Insert Book":
                    bookShelf.add(book);
                    break;

                case "Check Book":
                    int index = Integer.parseInt(book);

                    if(index >=0 && index < bookShelf.size()){
                        System.out.println(bookShelf.get(index));
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(bookShelf.toString().replaceAll("[\\[\\]]", ""));
    }
}