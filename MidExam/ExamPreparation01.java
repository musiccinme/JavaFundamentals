package MidExam;

import java.util.Scanner;

public class ExamPreparation01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double actualPlunder = 0.0;

        for(int i = 1; i <= daysOfPlunder; i++){
            actualPlunder += dailyPlunder;
            if(i % 3 == 0){
                actualPlunder += dailyPlunder*1.0/2;
            }
            if(i % 5 == 0){
                double loss = 0.3*actualPlunder;
                actualPlunder = actualPlunder - loss;
            }
        }

        if(actualPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", actualPlunder);
        } else {
            double percentage = (actualPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }


    }
}
