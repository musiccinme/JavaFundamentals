package L4Methods;

import java.util.Scanner;

public class Lab06CalculateRectangleArea {
    public static double getRectangleArea(double width, double length){
        return width*length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = getRectangleArea(width, length);
        System.out.printf("%.0f", area);

    }
}
