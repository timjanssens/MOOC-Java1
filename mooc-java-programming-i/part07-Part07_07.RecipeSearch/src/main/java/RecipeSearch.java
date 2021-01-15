
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<Recipe> recipies = new ArrayList<>();
     //   Recipe recipe = new Recipe();

        UserInterface userInterface = new UserInterface( inputScanner);

        userInterface.Start();

    }

}
