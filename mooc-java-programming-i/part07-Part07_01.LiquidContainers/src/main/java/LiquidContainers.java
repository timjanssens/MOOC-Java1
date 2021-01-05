
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int volumeFirst = 0;
        int volumeSecond = 0;

        while (true) {

            System.out.println("First: " + volumeFirst + "/100");
            System.out.println("Second: " + volumeSecond + "/100");

            String choice = scan.nextLine();

            if (choice.equals("quit")) {
                break;
            }

            String[] parts = choice.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    volumeFirst += amount;
                    if (volumeFirst > 100) {
                        volumeFirst = 100;
                    }
                }
            }

            if (command.equals("move")) {
                if (amount > 0) {
                    if (volumeFirst > amount) {
                        volumeFirst -= amount;
                        volumeSecond += amount;
                    } else {
                        volumeSecond += volumeFirst;
                        volumeFirst = 0;
                    }
                    if (volumeSecond > 100) {
                        volumeSecond = 100;
                    }
                }
            }

            if (command.equals("remove")) {
                if (amount > 0) {
                    volumeSecond -= amount;
                    if (volumeSecond < 00) {
                        volumeSecond = 0;
                    }
                }
            }

        }
    }

}
