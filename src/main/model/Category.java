package model;

import java.util.ArrayList;
import java.util.List;

// Represents a category containing a list of purchases, a name,
// percentage of income allocated to it, and total amount spent
public class Category {

    private String name;
    private List<Purchase> listPurchases;
    private boolean success;
    private double percent;
    private double remainingMoney;
    private double totalSpent;

    // EFFECTS: creates a new category with a name, how much percent
    // of income you want to spend on it
    public Category(String name, int percent) {
        this.listPurchases = new ArrayList<>();
        this.name = name;
        this.percent = percent;
        this.remainingMoney = 0;
        this.totalSpent = 0;
    }

    // MODIFIES: this
    // EFFECTS: updates category method with purchases and money spent
    public void updateCategory(User user) {
        resetTotalSpent();
        updateMoneyAvailableInCategory(user);
        moneySpentInCategory();
        moneyRemainingInCategory();
    }

    // MODIFIES: this
    // EFFECTS: calculates how much money should be spent in category based off income
    public double updateMoneyAvailableInCategory(User user) {
        return this.remainingMoney = user.getIncome() * this.percent / 100;
    }

    // MODIFIES: this
    // EFFECTS: calculates how much money left in category
    // Available - spent
    public double moneyRemainingInCategory() {
        return this.remainingMoney -= this.totalSpent;
    }

    // MODIFIES: this
    // EFFECTS: adds the total cost from all purchases in category
    public double moneySpentInCategory() {
        for (Purchase purchase : this.listPurchases) {
            this.totalSpent += purchase.getCost();
        }
        return totalSpent;
    }

    // MODIFIES: this
    // EFFECTS: resets total spent field
    public double resetTotalSpent() {
        return this.totalSpent = 0;
    }

    // MODIFIES: this
    // EFFECTS: produces true if purchase successfully added to list
    public String addPurchase(Purchase purchase) {
        listPurchases.add(purchase);
        return "Purchase successfully added.";
    }

    // REQUIRES: purchase list cannot be empty
    // MODIFIES:
    // EFFECTS: produces success if purchase successfully removed from list
    public String removePurchase(Purchase purchase) {
        if (listPurchases.contains(purchase)) {
            listPurchases.remove(purchase);
            return "Purchase successfully removed";
        } else {
            return "Unable to successfully remove purchase.";
        }
    }

    public String getName() {
        return this.name;
    }

    public double getRemainingMoney() {
        return remainingMoney;
    }

    public double getPercent() {
        return percent;
    }

    public List<Purchase> getListPurchases() {
        return listPurchases;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

}

