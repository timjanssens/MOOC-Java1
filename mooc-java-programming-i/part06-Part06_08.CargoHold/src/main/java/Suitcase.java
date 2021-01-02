
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
public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWheight;

    public Suitcase(int maxWeight) {
        this.maxWheight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = totalWeight();

        if (totalWeight + item.getWeight() <= this.maxWheight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item itemInList : items) {
            totalWeight += itemInList.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;

    }

    @Override
    public String toString() {

        if (items.isEmpty()) {
            return "no items (0kg)";
        }

        int totalWeight = totalWeight();

        if (items.size() == 1) {
            return this.items.size() + " item (" + totalWeight + "kg)";
        }

        return this.items.size() + " items (" + totalWeight + "kg)";
    }

}
