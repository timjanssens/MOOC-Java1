/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
    @Override
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Item, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the object to a Bird object
        Item comparedItem = (Item) compared;

        // if the values of the object variables are equal, the objects are, too
        return this.identifier.equals(comparedItem.identifier);
    }
}
