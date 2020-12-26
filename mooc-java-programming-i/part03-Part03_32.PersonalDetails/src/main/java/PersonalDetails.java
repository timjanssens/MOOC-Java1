
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalYears = 0;
        String nameLongest = "";
        double person = 0;
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] words = input.split(",");

            if (nameLongest.length() < words[0].length()) {
                nameLongest = words[0];
            }
            
            totalYears += Integer.valueOf(words[1]);
            person++;
        }

        System.out.println("Longest name: " + nameLongest);
        System.out.println("Average of the birth years: " + totalYears / person );

    }
}
