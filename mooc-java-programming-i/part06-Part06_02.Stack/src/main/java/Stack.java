
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
public class Stack {

    private ArrayList<String> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public void add(String value) {
        this.stackList.add(value);
    }

    public ArrayList<String> values() {
        return this.stackList;
    }

    public String take() {
        String lastValue = this.stackList.get(this.stackList.size() - 1);
        this.stackList.remove(this.stackList.size() - 1);
        return lastValue;
    }

}
