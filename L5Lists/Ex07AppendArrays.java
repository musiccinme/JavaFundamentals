package L5Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<String> metaList = Arrays.stream(values.split("\\|")).collect(Collectors.toList());
        Collections.reverse(metaList);
        System.out.println(metaList.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+", " "));
    }
}
