package L5Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mergeList = new ArrayList<>();

        int size = 0;

        if(firstList.size() < secondList.size()){
            size = firstList.size();
            for(int i = 0; i < size; i++){
                mergeList.add(firstList.get(i));
                mergeList.add(secondList.get(i));
            }
            for(int i = size; i < secondList.size(); i++){
                mergeList.add(secondList.get(i));
            }

        }else {
            size = secondList.size();
            for(int i = 0; i < size; i++){
                mergeList.add(firstList.get(i));
                mergeList.add(secondList.get(i));
            }
            for(int i = size; i < firstList.size(); i++){
                mergeList.add(firstList.get(i));
            }
        }

        for(int number : mergeList){
            System.out.print(number + " ");
        }

    }
}
