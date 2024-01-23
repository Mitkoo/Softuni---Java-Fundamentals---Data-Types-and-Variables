package Exercises;

import java.util.Scanner;

import static java.lang.System.in;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int capacity = 255;
        int numberOfLines = scanner.nextInt();

        for (int i = 1; i <= numberOfLines; i++){

            int waterBatchIn = scanner.nextInt();

            if (capacity < waterBatchIn){
                System.out.print("\nInsufficient capacity!");
            } else {
                capacity -= waterBatchIn;
            }
        }
        System.out.println("\n" + (255 - capacity));
    }
}
