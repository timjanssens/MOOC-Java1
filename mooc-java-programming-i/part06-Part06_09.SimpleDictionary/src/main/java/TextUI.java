
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
public class TextUI {

    //private WordSet wordSet;
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        //this.wordSet = wordSet;
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;

    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            if (word.equals("end")) {
                System.out.println("Bye bye!");
                return;
            }

            if (word.equals("add")) {
                System.out.print("Word: ");
                String wordEnglish = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                this.simpleDictionary.add(wordEnglish, translation);
            } else if (word.equals("search")) {
                System.out.print("To be translated: ");

                String toBeTranslated = scanner.nextLine();

                if (this.simpleDictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    String translation = this.simpleDictionary.translate(toBeTranslated);

                    System.out.println(translation);

                }
            } else {
                System.out.println("Unknown comand");
            }
        }

    }

}
