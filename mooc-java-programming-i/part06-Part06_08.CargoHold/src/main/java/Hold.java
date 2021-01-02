
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWheight = totalWeight();

        if (totalWheight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
     public void printItems(){
         for(Suitcase suitcase : suitcases){
             suitcase.printItems();
         }
     }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + "kg)";
    }

}
