package model;

import java.util.ArrayList;
import java.util.List;

// Represents a category containing a list of purchases, a name,
// percentage of income allocated to it, and total amount spent
public class Category {

    private String name;
    private List<Purchase> listPurchases;
    private boolean success;
    private int percent;
    private double remainingMoney;
    private double totalSpent;

    // EFFECTS: creates a new category with a name, how much percent
    // of income you want to spend on it
    public Category(String name, int percent) {
        this.listPurchases = new ArrayList<>();
        this.name = name;
        this.percent = percent;
        this.remainingMoney = 0;
    }

    // REQUIRES:
    // MODIFIES: this
    // EFFECTS: calculates how much money should be spent in category based off income
    public double moneyAvailableInCategory(Income income) {
        return remainingMoney = income.getMoney() * this.percent;
    }

    // REQUIRES:
    // MODIFIES: this
    // EFFECTS: calculates how much money left in category
    // Available - spent
    public double moneyRemainingInCategory() {
        return 10;

    }

    // REQUIRES:
    // MODIFIES: this
    // EFFECTS: adds the total cost from all purchases in category
    public double moneySpentInCategory() {
        for (Purchase purchase : this.listPurchases) {
            this.totalSpent += purchase.getCost();
        }
        return totalSpent;
    }

    // REQUIRES:
    // MODIFIES: this
    // EFFECTS: adds the cost of a purchase to the total spent
    public double addPurchaseAmount(Purchase purchase) {
        return this.totalSpent += purchase.getCost();
    }

    // REQUIRES:
    // MODIFIES: this
    // EFFECTS: produces true if purchase successfully added to list
    public Boolean addPurchase(Purchase purchase) {
        if (listPurchases.contains(purchase)) {
            return false;
        } else {
            listPurchases.add(purchase);
            return true;
        }
    }

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: produces true if purchase successfully removed from list
    public Boolean removePurchase(Purchase purchase) {
        if (listPurchases.contains(purchase)) {
            listPurchases.remove(purchase);
            return true;
        } else {
            return false;
        }
    }

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: returns message for add purchase
    public String feedbackAddPurchase(boolean addSuccess) {
        if (success) {
            return "Purchase successfully added";
        } else {
            return "Unable to successfully add purchase.";
        }
    }

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: returns message for remove purchase
    public String feedbackRemovePurchase(boolean removeSuccess) {
        if (success) {
            return "Purchase successfully removed";
        } else {
            return "Unable to successfully remove purchase.";
        }
    }

    public String getName() {
        return this.name;
    }

}
