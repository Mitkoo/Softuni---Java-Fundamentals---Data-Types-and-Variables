package Exercises;

import java.util.Scanner;

import static java.lang.System.in;

public class PrintPartOfTheASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++){
            char character = (char) i;
            System.out.print(character + " ");
        }
    }
}
