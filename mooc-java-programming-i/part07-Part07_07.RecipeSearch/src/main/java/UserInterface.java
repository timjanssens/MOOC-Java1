
import java.nio.file.Paths;
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

    private Scanner inputScanner;
    ArrayList<Recipe> recipies = new ArrayList<>();

    public UserInterface(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void Start() {

        System.out.print("File to read: ");
        String fileName = inputScanner.nextLine();

        ReadFileAndPutObjectsInList(fileName);

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        while (true) {

            System.out.print("Enter command: ");
            String command = inputScanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                PrintRecipiesToScreen();
            }
        }
    }

    private void PrintRecipiesToScreen() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipies) {
            System.out.println(recipe);
        }
    }

    private void ReadFileAndPutObjectsInList(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            // count is used to see if line == name or coockingTime or is an ingredient
            int count = 0;
            String recipeName = "";
            int cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            Recipe recipe = new Recipe();
            // we read all the lines of the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (count == 0) {
                    recipeName = line;
                } else if (count == 1) {
                    cookingTime = Integer.valueOf(line);
                } else {
                    ingredients.add(line);
                }
                count++;
                // if the line is blank we do nothing
                if (line.isEmpty()) {
                    ingredients.remove(ingredients.size() - 1);
                    recipies.add(new Recipe(recipeName, cookingTime, ingredients));
                    ingredients.clear();
                    count = 0;

                }

                // do something with the data
            }

            recipies.add(new Recipe(recipeName, cookingTime, ingredients));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
