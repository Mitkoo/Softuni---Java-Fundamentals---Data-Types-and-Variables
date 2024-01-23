import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int inputs = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Double> map = new HashMap<>();

        for (int i = 1; i <= inputs; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            //V=πr2h
            double volume = Math.PI * radius * radius * height;
            map.put(model, volume);
        }

        Map.Entry<String, Double> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        System.out.println(maxEntry.getKey());
    }
}
