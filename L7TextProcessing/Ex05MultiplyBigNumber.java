package L7TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger big = new BigInteger(scanner.nextLine());
        BigInteger small = new BigInteger(scanner.nextLine());

        System.out.println(big.multiply(small));
    }
}
