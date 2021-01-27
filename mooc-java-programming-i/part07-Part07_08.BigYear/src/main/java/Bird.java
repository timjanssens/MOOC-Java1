
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
public class Bird {

    private String Name;
    private String LatinName;
    private int Observation;

    private static ArrayList<Bird> BirdList = new ArrayList<>();

    public Bird() {
    }

    public Bird(String name, String latinName) {
        this.Name = name;
        this.LatinName = latinName;
    }

    public String getLatinName() {
        return LatinName;
    }

    public String getName() {
        return Name;
    }

    public int getObservation() {
        return Observation;
    }

    public static void AddObservation(String birdName) {
        boolean birdInList = false;
        for (Bird bird : BirdList) {
            if (bird.Name.equals(birdName)) {
                bird.Observation++;
                birdInList = true;
            }
        }

        if (!birdInList) {
            System.out.println("Not a bird!");
        }

    }

    public void AddBirdToList(Bird bird) {
        this.BirdList.add(bird);
    }

    public static void PrintBirdList() {
        for (Bird bird : BirdList) {
            System.out.println(bird);
        }
    }

    public static void PrintBird(String birdName) {
        for (Bird bird : BirdList) {
            if (bird.Name.equals(birdName)) {
                System.out.println(bird);
            }
        }
    }

    @Override
    public String toString() {
        return this.Name + "(" + this.LatinName + "): " + this.Observation + " observations";
    }

}
