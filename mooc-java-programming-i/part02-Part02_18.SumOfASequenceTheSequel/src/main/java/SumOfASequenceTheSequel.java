
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number?");
        int numberOne = Integer.valueOf(scanner.nextLine());

        System.out.print("Second number?");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = numberOne; i <= numberTwo; i++) {
            sum += i;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
