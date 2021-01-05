/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class Container {

    private int amountInContainer;

    public Container() {
        this.amountInContainer = 0;
    }

    public int contains() {
        return this.amountInContainer;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amountInContainer += amount;
            if (this.amountInContainer > 100) {
                this.amountInContainer = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amountInContainer -= amount;
            if (this.amountInContainer < 0) {
                this.amountInContainer = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.amountInContainer + "/100";
    }
}
