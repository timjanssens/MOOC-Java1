
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        int ancient = 2015;

        System.out.println("Give a number");
        int year = Integer.valueOf(scan.nextLine());

        if (year < ancient) {
            System.out.println("Ancient history!");
        }
    }
}
