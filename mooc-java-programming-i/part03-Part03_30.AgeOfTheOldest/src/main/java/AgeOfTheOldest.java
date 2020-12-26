
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOfOldest = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] words = input.split(",");

            if (ageOfOldest <= Integer.valueOf(words[1])) {
                ageOfOldest = Integer.valueOf(words[1]);
            }

        }
        
        System.out.println("Age of the oldest: " + ageOfOldest);
    }
}
