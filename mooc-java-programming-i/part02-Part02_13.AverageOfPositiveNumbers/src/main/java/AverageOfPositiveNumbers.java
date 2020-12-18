
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int times = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                times++;
                continue;
            }
        }

        if (times > 0) {
            double average = sum / (double) times;
            System.out.print("Average of the numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
