package L3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";
        int bestSequence = -1;
        int bestIndex = Integer.MIN_VALUE;
        int bestSampleIndex = 0;
        int bestSum = 0;

        int dnaSampleCounter = 0;

        int dnaLength = Integer.parseInt(scanner.nextLine());
        int[] bestDna = new int[dnaLength];
        input = scanner.nextLine();

        while (!input.equals("Clone them!")){

            int[] currentDNASample = Arrays.stream(input.split("!+")).mapToInt(value->Integer.parseInt(value)).toArray();
            dnaSampleCounter++;

            int currentSum = 0;
            int currentLength = 0;
            int currentBestLength = 0;
            int currentEndIndex = 0;


            for(int i = 0; i < currentDNASample.length; i++) {
                if(currentDNASample[i] == 1){
                    currentSum++;
                    currentLength++;
                    if(currentLength>currentBestLength){
                        currentBestLength = currentLength;
                        currentEndIndex = i;
                    }
                } else {
                    currentLength = 0;
                }
            }

            int currentBestIndex = currentEndIndex - currentBestLength + 1;

            boolean isCurrentBest = false;

            if(currentBestLength > bestSequence){
                isCurrentBest = true;
            } else if(currentBestLength == bestSequence){
                if (currentBestIndex == bestIndex){
                    if (currentSum > bestSum) {
                        isCurrentBest = true;
                    }
                } else if(currentBestIndex<bestIndex){
                    isCurrentBest = true;
                }
            }

            if(isCurrentBest){
                bestDna = currentDNASample;
                bestSequence = currentBestLength;
                bestIndex = currentBestIndex;
                bestSum = currentSum;
                bestSampleIndex = dnaSampleCounter;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSampleIndex, bestSum);
        for(int elem:bestDna){
            System.out.print(elem + " ");
        }




       /* Scanner scanner = new Scanner(System.in);

        String command = "";
        int bestSequence = -1;
        int bestIndex = Integer.MIN_VALUE;
        int bestSampleIndex = 0;
        int bestSum = 0;


        int sample = 0;


        int length = Integer.parseInt(scanner.nextLine());
        int[] bestDna = new int[length];
        command = scanner.nextLine();
        while(!command.equals("Clone them!")){

            int[] curSample = Arrays.stream(command.split("!+")).
                    mapToInt(value -> Integer.parseInt(value)).toArray();
            sample++;

            int curLength = 0;
            int curBestLength = 0;
            int curEndIndex = 0;
            int curSum = 0;


            for (int i = 0; i < curSample.length; i++) {

                if (curSample[i] == 1) {
                    curLength++;
                    if (curLength > curBestLength) {
                        curBestLength = curLength;
                        curEndIndex = i;
                    }
                } else {
                    curLength = 0;
                }
            }
            //calc the sum in the current sample
            for (int j = 0; j < curSample.length; j++) {
                curSum += curSample[j];
            }
            //finding the index
            int curStartIndex = curEndIndex - curBestLength +1;
            boolean isBetter = false;

            if(curBestLength > bestSequence){
                isBetter = true;
            }else if (curBestLength == bestSequence){
                if(curStartIndex < bestIndex){
                    isBetter = true;
                }else if (curStartIndex == bestIndex){
                    if(curSum > bestSum){
                        isBetter = true;
                    }
                }
            }

            if(isBetter){
                bestDna = curSample;
                bestIndex = curStartIndex;
                bestSequence = curBestLength;
                bestSum = curSum;
                bestSampleIndex = sample;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSampleIndex,bestSum);
        for (int i = 0; i < bestDna.length; i++) {
            System.out.print(bestDna[i] + " ");
        }*/




    }
}
