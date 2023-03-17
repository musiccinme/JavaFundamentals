package L6AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" ")).
                mapToDouble(e -> Double.parseDouble(e)).toArray();

        Map<Double, Integer> count = new TreeMap<>();

        for (double num : nums) {
            if(!count.containsKey(num)){
                count.put(num, 1);
            }else {
                count.put(num, count.get(num) + 1);
            }
        }

        for(Map.Entry<Double, Integer> entry : count.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
