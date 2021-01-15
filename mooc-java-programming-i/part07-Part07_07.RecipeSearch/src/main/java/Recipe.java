
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author timja
 */
public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipe() {
    }
  
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        for(String ingredient : ingredients){
            this.ingredients.add(ingredient);
        }
        
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

}
