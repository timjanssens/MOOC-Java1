
import com.sun.jndi.ldap.BerDecoder;
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

    private Scanner Scanner;
    private Bird bird = new Bird();

    public UserInterface(Scanner scan) {
        this.Scanner = scan;
    }

    public void start() {

        while (true) {
            System.out.print("? ");
            String choice = Scanner.nextLine();

            if (choice.equals("Quit")) {
                break;
            } else if (choice.equals("Add")) {
                CreateBirdAddToList();
            } else if (choice.equals("Observation")) {
                AddObservation();
            } else if (choice.equals("One")) {
                PrintBird();
            } else if (choice.equals("All")) {
                Bird.PrintBirdList();
            }

        }

    }

    private void PrintBird() {
        System.out.print("Bird?");
        String birdName = Scanner.nextLine();
        
        Bird.PrintBird(birdName);
    }

    private void AddObservation() {
        System.out.print("Bird? ");
        String birdName = Scanner.nextLine();

        Bird.AddObservation(birdName);
    }

    private void CreateBirdAddToList() {
        System.out.print("Name: ");
        String name = Scanner.nextLine();

        System.out.print("Name in Latin: ");
        String nameLatin = Scanner.nextLine();

        bird.AddBirdToList(new Bird(name, nameLatin));
    }

}
