package Exercises;

import java.util.Scanner;

import static java.lang.System.in;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int lines = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;

        for (int line = 1; line <= lines; line++){
            String numberText = scanner.nextLine();
            char numberChar = numberText.charAt(0);
            int number = (int) numberChar;
            sum += number;
        }
        System.out.println("The sum equals: " + sum);
    }
}
