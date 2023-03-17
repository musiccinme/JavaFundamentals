package L5Lists;
//Not finished
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex08AnonymousThreat {

    /*public static void divideCIA(List<String> theList, int anIndex, int partitions) {
        List<String> temp = Arrays.stream(theList.get(anIndex).split("(?!^)"))
                .collect(Collectors.toList());;
        double charsPerGroup = Math.floor(temp.size()/partitions);
        double bigGroup = temp.size()-(charsPerGroup)*(partitions-1);

        int setLastIndex = 0;
        for (int i = 0; i < partitions-1; i++) { // temp
            for (int ii = 1; ii < charsPerGroup; ii++) {
                temp.set(i, temp.get(i) + temp.get(i+1));
                temp.remove(i+1);
            }
            setLastIndex = i+1;
        }
        for (int i = setLastIndex; i < temp.size()-1;) {
            temp.set(i, temp.get(i) + temp.get(i+1));
            temp.remove(i+1);
            i = setLastIndex;
        }
        //System.out.printf("%n");
        //for (String Y: temp) System.out.print( Y + " ");
        theList.addAll(anIndex+1, temp);
        theList.remove(anIndex);
        //System.out.printf("%n");
        //for (String Y: theList) System.out.print(Y + " ");

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")){
            String[] command = input.split(" ");

            if(command[0].equals("merge")){
                int startIndex = Math.max(0, Integer.parseInt(command[1]));
                int endIndex = Math.min(data.size()-1, Integer.parseInt(command[2]));

                for(int i = startIndex; i < endIndex; i++){
                    data.set(startIndex, data.get(startIndex) + data.get(startIndex+1));
                    data.remove(startIndex+1);
                }

            }else if(command[0].equals("divide")){
                int index = Integer.parseInt(command[1]);
                int partitions = Integer.parseInt(command[2]);
                List<String> arrayToPartition = Arrays.stream(data.get(index).split("")).collect(Collectors.toList());
                if(arrayToPartition.size() % partitions == 0){
                    int subStringLength = arrayToPartition.size() / partitions;
                    for(int i = subStringLength-1; i < arrayToPartition.size() - subStringLength; i = i + subStringLength){
                        arrayToPartition.set(i, arrayToPartition.get(i) + " ");
                    }

                    data.addAll(index+1, arrayToPartition);
                    data.remove(index);
                }//else {

                //}
            }

            input = scanner.nextLine();
        }
        for(String elem : data) {
            System.out.print(elem + " ");
        }
    }
}
