package Lab;

import java.util.Scanner;

import static java.lang.System.in;

public class ReversedChars_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();

        System.out.printf("%s %s %s", three, two, one);
    }
}
