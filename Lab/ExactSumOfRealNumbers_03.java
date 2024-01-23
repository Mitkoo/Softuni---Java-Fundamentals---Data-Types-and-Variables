package Lab;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.System.in;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        BigDecimal sum = BigDecimal.ZERO;
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            BigDecimal numberBig = scanner.nextBigDecimal();
            sum = sum.add(numberBig);
        }
        System.out.println(sum);
    }
}
