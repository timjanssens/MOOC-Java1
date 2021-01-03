
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author timja
 */
public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            PrintMenu();
            String commandUser = GetCommandUser();

            if (commandUser.equals("X")) {
                break;
            }
            if (commandUser.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokeManager.addJoke(joke);
            }
            if (commandUser.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
            }
            if (commandUser.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }

        }

    }

    public void PrintMenu() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

    public String GetCommandUser() {
        return scanner.nextLine();
    }
}
