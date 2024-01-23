package Lab;

import java.util.Scanner;

import static java.lang.System.in;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            if (i == 5 || i == 7 || i == 11){
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
