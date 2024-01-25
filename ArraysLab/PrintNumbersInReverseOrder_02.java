package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i <= number - 1; i++){
            array[i] = scanner.nextInt();
        }

        for (int j = array.length - 1; j > -1; j--){
            System.out.printf("%d ", array[j]);
        }
    }
}
