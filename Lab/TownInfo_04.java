package Lab;

import java.util.Scanner;

import static java.lang.System.in;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String townName = scanner.nextLine();
        int population = scanner.nextInt();
        int area = scanner.nextInt();

        System.out.printf("Town %s has population of %s and area %s square km.", townName,population, area);
    }
}
