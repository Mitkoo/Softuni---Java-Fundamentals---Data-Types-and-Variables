import java.util.Scanner;

import static java.lang.System.in;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= String.valueOf(number).length(); i ++){
            char digit = String.valueOf(number).charAt(i-1);
            sum += Integer.parseInt(String.valueOf(digit));
        }
        System.out.println(sum);
    }
}
