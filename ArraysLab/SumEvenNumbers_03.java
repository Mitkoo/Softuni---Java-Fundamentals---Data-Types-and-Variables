package ArraysLab;
import java.util.Arrays;
import java.util.Scanner;
public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                                                                .mapToInt(Integer::parseInt)
                                                                .toArray();
        int sum = 0;
        for (int i: numbers){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
