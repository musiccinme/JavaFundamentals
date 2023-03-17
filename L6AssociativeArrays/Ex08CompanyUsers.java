package L6AssociativeArrays;

import java.util.*;

public class Ex08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> companies = new TreeMap<>();

        while (!input.equals("End")){
            String nameCompany = input.split(" -> ")[0];
            String employeeID = input.split(" -> ")[1];

            companies.putIfAbsent(nameCompany, new ArrayList<>());
            List<String> currentIDs = companies.get(nameCompany);
            if(!currentIDs.contains(employeeID)){
                companies.get(nameCompany).add(employeeID);
            }

            input = scanner.nextLine();
        }

        companies.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            e.getValue().forEach(a -> System.out.println("-- " + a));
        });
    }
}
