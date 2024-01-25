package MoreExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        while (scanner.hasNext()){
            Object input = scanner.nextLine();
            String type = null;

            if (!input.equals("END")){
                type = ((Object) input).getClass().getSimpleName();
            }
            System.out.println(type);
        }
    }
}
