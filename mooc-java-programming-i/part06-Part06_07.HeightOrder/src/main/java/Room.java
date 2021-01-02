
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
public class Room {
    
    private ArrayList<Person> persons = new ArrayList<>();

    public Room() {
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    
    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        
        Person shortest = persons.get(0);
        
        for(Person person : persons){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    
    public Person take(){
        
        Person shortestPerson = this.shortest();
        
        persons.remove(shortestPerson);
        return shortestPerson;
    }
    
    
}
