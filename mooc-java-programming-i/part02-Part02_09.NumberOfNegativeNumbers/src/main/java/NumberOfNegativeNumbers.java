
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negative = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number < 0){
                negative++;
                continue;
            }
            
            if (number == 0) {
                break;
            }

        }

        System.out.print("Number of negative numbers: " + negative);

    }
}
