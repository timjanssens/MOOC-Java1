
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int times = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum += number;
            times++;
        }

        System.out.print("Number of numbers: " + times);
        System.out.println("");
        System.out.print("Sum of the numbers: " + sum);
    }
}
