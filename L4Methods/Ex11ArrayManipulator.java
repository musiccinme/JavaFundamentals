package L4Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11ArrayManipulator {
    public static int[] exchange(int[] array, int index){
        int[] newArray = new int[array.length];

        if(index > array.length - 1 || index < 0){
            System.out.println("Invalid index");
            return array;
        } else {
            for (int i = 0; i < array.length - 1 - index; i++) {
                newArray[i] = array[index + 1 + i];
            }
            int j = 0;
            for (int i = array.length - 1 - index; i < array.length; i++) {
                newArray[i] = array[j];
                j = j + 1;
            }
        }
        return newArray;
    }

    public static void maxMinEven(String command, int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexOfMaxEven = -1;
        int indexOfMinEven = -1;
        int countMax = 0;
        int countMin = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                if (array[i] >= max){
                    max = array[i];
                    indexOfMaxEven = i;
                    countMax++;
                }
                if(array[i] <= min){
                    min = array[i];
                    indexOfMinEven = i;
                    countMin++;
                }
            }
        }
        if(command.equals("max")) {
            if (countMax == 0) {
                System.out.println("No matches");
            }else {
                System.out.println(indexOfMaxEven);
            }
        }else {
            if (countMin == 0) {
                System.out.println("No matches");
            }else {
                System.out.println(indexOfMinEven);
            }
        }

    }


    public static void maxMinOdd(String command, int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexOfMaxOdd = -1;
        int indexOfMinOdd = -1;
        int countMax = 0;
        int countMin = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                if (array[i] >= max){
                    max = array[i];
                    indexOfMaxOdd = i;
                    countMax++;
                }
                if(array[i] <= min){
                    min = array[i];
                    indexOfMinOdd = i;
                    countMin++;
                }
            }
        }
        if(command.equals("max")) {
            if (countMax == 0) {
                System.out.println("No matches");
            }else {
                System.out.println(indexOfMaxOdd);
            }
        }else {
            if (countMin == 0) {
                System.out.println("No matches");
            }else {
                System.out.println(indexOfMinOdd);
            }
        }

    }


    public static void printFirstNEven(int[] array, int n){
        if(n > array.length){
            System.out.println("Invalid count");
        } else {
            int[] arrayWithEvens = Arrays.copyOf(array, 0);
            int count = 0;

            for(int i = 0; i < array.length; i++){

                if(array[i] % 2 == 0){
                    arrayWithEvens = Arrays.copyOf(arrayWithEvens, arrayWithEvens.length+1);
                    arrayWithEvens[count] = array[i];
                    count = count +1;
                    n = n - 1;
                }

                if(n == 0) {
                    break;
                }

            }

            System.out.print("[");
            for (int i = 0; i < arrayWithEvens.length; i++){
                if(i == arrayWithEvens.length-1){
                    System.out.print(arrayWithEvens[i]);
                }else {
                    System.out.print(arrayWithEvens[i] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();



        }
    }


    public static void printFirstNOdd(int[] array, int n){
        if(n > array.length){
            System.out.println("Invalid count");
        } else {
            int[] arrayWithOdds = new int[0];
            int count = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 != 0){
                    arrayWithOdds = Arrays.copyOf(arrayWithOdds, arrayWithOdds.length + 1);
                    arrayWithOdds[count] = array[i];
                    count++;
                    n = n - 1;
                }

               if(n == 0){
                 break;
               }

            }

            System.out.print("[");
            for (int i = 0; i < arrayWithOdds.length; i++){
                if(i == arrayWithOdds.length - 1){
                    System.out.print(arrayWithOdds[i]);
                }else {
                    System.out.print(arrayWithOdds[i] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();

        }
    }


    public static void printLastNEven(int[] array, int n){
        if(n > array.length){
            System.out.println("Invalid count");
        } else {
            int[] arrayWithEvens = new int[0];
            int count = 0;

            for(int i = array.length - 1; i >= 0; i--){
                 if(array[i] % 2 == 0){
                     arrayWithEvens = Arrays.copyOf(arrayWithEvens, arrayWithEvens.length + 1);
                     arrayWithEvens[count] = array[i];
                     count++;
                     n = n - 1;
                 }

                 if(n == 0){
                     break;
                 }

            }

            System.out.print("[");
            for (int i = arrayWithEvens.length - 1; i >= 0; i--){
                if(i == 0){
                    System.out.print(arrayWithEvens[i]);
                }else {
                    System.out.print(arrayWithEvens[i] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }


    public static void printLastNOdd(int[] array, int n){
        if(n > array.length){
            System.out.println("Invalid count");
        } else {
            int[] arrayWithOdds = new int[0];
            int count = 0;

            for(int i = array.length - 1; i >= 0; i--){
                    if(array[i] % 2 != 0){
                        arrayWithOdds = Arrays.copyOf(arrayWithOdds, arrayWithOdds.length + 1);
                        arrayWithOdds[count] = array[i];
                        count++;
                        n = n - 1;
                    }

                    if(n == 0){
                        break;
                    }
            }

            System.out.print("[");
            for (int i = arrayWithOdds.length - 1; i >= 0; i--){
                if(i == 0){
                    System.out.print(arrayWithOdds[i]);
                }else {
                    System.out.print(arrayWithOdds[i] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();

        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] initialArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        String input = scanner.nextLine();


        while (!input.equals("end")){

            String[] command = input.split(" ");
            if(command.length < 3) {
                if (command[0].equals("exchange")) {
                    int splitIndex = Integer.parseInt(command[1]);
                    initialArray = exchange(initialArray, splitIndex);
                } else if (command[1].equals("even")) {
                    maxMinEven(command[0], initialArray);
                } else if (command[1].equals("odd")) {
                    maxMinOdd(command[0], initialArray);
                }
            }else {
                if(command[0].equals("first") && command[2].equals("even")){
                    int n = Integer.parseInt(command[1]);
                    printFirstNEven(initialArray, n);
                }else if(command[0].equals("first") && command[2].equals("odd")){
                    int n = Integer.parseInt(command[1]);
                    printFirstNOdd(initialArray, n);
                }else if(command[0].equals("last") && command[2].equals("even")){
                    int n = Integer.parseInt(command[1]);
                    printLastNEven(initialArray, n);
                }else if(command[0].equals("last") && command[2].equals("odd")){
                    int n = Integer.parseInt(command[1]);
                    printLastNOdd(initialArray, n);
                }

            }

            input = scanner.nextLine();
        }
        System.out.print("[");
        for(int i = 0; i < initialArray.length; i++){
            if(i == initialArray.length - 1){
                System.out.print(initialArray[i]);
            }else {
                System.out.print(initialArray[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
