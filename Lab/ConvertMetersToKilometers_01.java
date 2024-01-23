package Lab;

import java.util.Scanner;

import static java.lang.System.in;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double meters = scanner.nextInt();

        double km = meters / 1000;

        System.out.printf("%.2f", km);
    }
}
