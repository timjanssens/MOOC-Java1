
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            sum += number;

            if (number == 0) {
                break;
            }

        }

        System.out.print("Sum of the numbers: " + sum);

    }
}
