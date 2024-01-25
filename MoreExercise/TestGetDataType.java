package MoreExercise;

import java.util.Scanner;

public class TestGetDataType {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String value:");
        String str = sc.nextLine();

        System.out.println("Enter Integer value:");
        Integer intData = sc.nextInt();

        System.out.println("Enter Character value:");
        Character charData = sc.next().charAt(0);

        sc.close();

        System.out.println(intData + " is of type " + intData.getClass().getSimpleName());
        System.out.println(charData + " is of type " + charData.getClass().getSimpleName());
        System.out.println(str + " is of type " + str.getClass().getSimpleName());
    }
}
