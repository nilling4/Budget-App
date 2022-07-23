package model;

import com.sun.org.apache.xpath.internal.operations.Bool;

// Represents users income
public class Income {

    private double money;

    // REQUIRES: amount > 0
    // MODIFIES: this
    // EFFECTS: Increases money by amount
    public Boolean increaseMoney(double amount) {
        if (amount > 0) {
            this.money += amount;
            return true;
        } else {
            return false;
        }
    }

    // REQUIRES: money - amount > ultimateSpent
    // MODIFIES: this
    // EFFECTS: decreases money by amount
    public Boolean decreaseMoney(double amount) {

    }

    public double getMoney() {
        return this.money;
    }

}
