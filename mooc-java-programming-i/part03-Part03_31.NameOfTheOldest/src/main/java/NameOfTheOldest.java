
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOfOldest = 0;
        String nameOfOldest = "";
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] words = input.split(",");

            if (ageOfOldest <= Integer.valueOf(words[1])) {
                ageOfOldest = Integer.valueOf(words[1]);
                nameOfOldest = words[0];
            }

        }

        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
