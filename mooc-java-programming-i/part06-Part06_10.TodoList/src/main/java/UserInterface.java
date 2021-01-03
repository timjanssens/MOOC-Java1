
import java.util.ArrayList;
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

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {

        while (true) {

            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                return;
            }

            if (command.equals("add")) {
                System.out.print("To add : ");
                String word = scanner.nextLine();
                this.list.add(word);
            }

            if (command.equals("list")) {
                this.list.print();
            }

            if (command.equals("remove")) {
                System.out.print("Wich one is romved? ");
                int numberToRemove = Integer.valueOf(scanner.nextLine());
                this.list.remove(numberToRemove);
            }

        }

    }

}
