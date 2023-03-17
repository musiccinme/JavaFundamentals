package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(?<name>[A-Z][a-z][a-z]+ [A-Z][a-z][a-z]+)#+(?<position>[A-Z][A-Za-z]+(&[A-Z][A-Za-z]+)?(&[A-Z][A-Za-z]+)?)" +
                "\\d{2}(?<company>[A-Z][A-Za-z]+ (JSC|Ltd\\.))";

        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile(regex);

        for(int i = 1; i <= n; i++){
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                String name = matcher.group("name");
                String company = matcher.group("company");
                String position = matcher.group("position");

                if(position.contains("&")){
                    position =position.replaceAll("&", " ");
                }
                System.out.printf("%s is %s at %s%n", name, position, company);
            }
        }
    }
}
