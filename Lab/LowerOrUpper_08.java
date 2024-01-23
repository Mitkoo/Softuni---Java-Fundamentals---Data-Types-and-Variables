package Lab;

import java.util.Scanner;

import static java.lang.System.in;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String character = scanner.nextLine();
        char characterChar = character.charAt(0);
        Boolean charIsLower = Character.isLowerCase(characterChar);

        if (charIsLower){
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
