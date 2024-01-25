package ArraysLab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        String[] days = {"Invalid day!","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber > -1 && dayNumber < 8){
            System.out.println(days[dayNumber]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
