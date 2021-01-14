
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

    private Recipe recipe;
    private Scanner inputScanner;
//    private Scanner fileScanner;

    public void Start() {

        System.out.print("File to read: ");
        String fileName = inputScanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            
            int count = 0;
            String recipeName;
            int  cookingTime;
            ArrayList<String> ingredients = new ArrayList<>();
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
                 
                    continue;
                }

                // do something with the data
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        while (true) {

            System.out.print("Enter command: ");
            String command = inputScanner.nextLine();
        }
    }
}
