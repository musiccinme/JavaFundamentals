package L4Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab08MathPower {
    public static double getPower(double base, int power){
        double result = 1;
        for(int i = 1; i <= power; i++){
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = getPower(base, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }
}
