import java.util.Scanner;

import static java.lang.System.in;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        long result = (first + second) / third * fourth;

        System.out.println(result);
    }
}
