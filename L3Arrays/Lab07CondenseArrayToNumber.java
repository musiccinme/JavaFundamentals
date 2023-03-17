package L3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] condensed = new int[nums.length-1];

        while (nums.length != 0) {
            if (nums.length != 1) {
                for (int i = 0; i < nums.length - 1; i++) {
                    condensed[i] = nums[i] + nums[i + 1];
                }
                nums = Arrays.copyOf(nums, nums.length - 1);
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = condensed[i];
                }
            } else {
                condensed = new int[nums.length];
                condensed[0] = nums[0];
                break;
            }
        }
        System.out.println(condensed[0]);
    }
}
