package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chars = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);

        int rounds = chars.length / 2;
        int elementOneIndex = 0;
        int elementTwoIndex = chars.length - 1;
        String elementOne = null;
        String elementTwo = null;

        for (int i = 0; i < rounds; i++){
            elementOne = chars[elementOneIndex];
            elementTwo = chars[elementTwoIndex];

            chars[elementOneIndex] = elementTwo;
            chars[elementTwoIndex] = elementOne;

            elementOneIndex += 1;
            elementTwoIndex -= 1;
        }

        for (int j = 0; j <= chars.length - 1; j++){
            System.out.print(chars[j] + " ");
        }
    }
}
