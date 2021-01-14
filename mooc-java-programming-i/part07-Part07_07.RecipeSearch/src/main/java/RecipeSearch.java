
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
//        UserInterface userInterface = new UserInterface();
        ArrayList<Recipe> recipies = new ArrayList<>();

        System.out.print("File to read: ");
        String fileName = inputScanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            // count is used to see if line == name or coockingTime or is an ingredient
            int count = 0;
            String recipeName = "";
            int  cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            Recipe recipe = new Recipe();
            // we read all the lines of the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                 if(count == 0){
                     recipeName = line;
                 } else if(count == 1) {
                     cookingTime = Integer.valueOf(line);
                 } else {
                     ingredients.add(line);
                 }
                count++;
                // if the line is blank we do nothing
                if (line.isEmpty()) {
             //     ingredients.remove(ingredients.size()-1);
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

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

//        while (true) {
//
//            System.out.print("Enter command: ");
//            String command = inputScanner.nextLine();
//        }
        for(Recipe recipe : recipies){
            System.out.println(recipe);
        }
    }

}
