package Exercises;

import java.util.Scanner;

import static java.lang.System.in;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int people = scanner.nextInt();
        int capacity = scanner.nextInt();

        int trips = (int) Math.ceil((double) people/capacity);

        System.out.printf("%d", trips);

    }
}
