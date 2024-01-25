package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                                                         .mapToInt(Integer::parseInt)
                                                         .toArray();

        int[] numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                                                         .mapToInt(Integer::parseInt)
                                                         .toArray();

        int sum = 0;
        int differenceIndex = -1;
        for (int i = 0; i <= numbers1.length -1; i++){
            if (numbers1[i] != numbers2[i]){
                differenceIndex = i;
                break;
            } else {
                sum += numbers1[i];
            }
        }

        if (differenceIndex == -1){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", differenceIndex);
        }
    }
}
