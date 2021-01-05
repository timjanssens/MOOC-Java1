
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

    //private Container container;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {

        Container first = new Container();
        Container second = new Container();

        while (true) {

            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String choice = scanner.nextLine();

            if (choice.equals("quit")) {
                break;
            }

            String[] parts = choice.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if(first.contains() > amount){
                second.add(amount);
                first.remove(amount);
                }else {
                    second.add(first.contains());
                    first.remove(amount);
                }
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }

    }

}
