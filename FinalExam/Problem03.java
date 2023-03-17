package FinalExam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> distributors = new TreeMap<>();
        Map<String, Double> clients = new TreeMap<>();

        String input = scanner.nextLine();
        double totalClientSum = 0.0;

        while (!input.equals("End")){
            String[] command = input.split(" ");

            switch (command[0]){
                case "Deliver":
                    String distributor = command[1];
                    double costDelivery = Double.parseDouble(command[2]);

                    distributors.putIfAbsent(distributor, 0.0);
                    distributors.put(distributor, distributors.get(distributor) + costDelivery);
                    break;

                case "Return":
                    distributor = command[1];
                    double costReturn = Double.parseDouble(command[2]);

                    if(!distributors.containsKey(distributor)){
                        break;
                    }
                    double spendMoney = distributors.get(distributor);
                    if(spendMoney < costReturn){
                        break;
                    }

                    distributors.replace(distributor, spendMoney-costReturn);
                    if(distributors.get(distributor) == 0.0){
                        distributors.remove(distributor);
                    }
                    break;

                case "Sell":
                    String client = command[1];
                    double costSpend = Double.parseDouble(command[2]);
                    totalClientSum += costSpend;

                    clients.putIfAbsent(client, 0.0);
                    clients.put(client, clients.get(client) + costSpend);
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : clients.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        }
        System.out.println("-----------");
        for (Map.Entry<String, Double> entry : distributors.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        }
        System.out.println("-----------");
        System.out.printf("Total Income: %.2f%n", totalClientSum);
    }
}
