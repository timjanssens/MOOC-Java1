
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
public class TodoList {
    
    private ArrayList<String> toList;

    public TodoList() {
        this.toList = new ArrayList<>();
    }
    
    
    
    
    public void add(String task){
        this.toList.add(task);
    }
    
    public void print(){
        for (int i = 0; i < toList.size() ; i++) {
            System.out.println((i+1) + ": " + this.toList.get(i));
        }
 
    }
    
    
    public void remove(int number){
        this.toList.remove(number-1);
    }
    
}
