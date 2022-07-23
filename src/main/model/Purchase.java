package model;

// Represents an item purchased with a name and cost
public class Purchase {
    private String name;
    private double cost;
    private boolean feedback;

    // REQUIRES:
    // MODIFIES:
    // EFFECTS:
    public Purchase(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // REQUIRES: new name cannot be ""
    // MODIFIES: this
    // EFFECTS: produces true if name successfully added, false otherwise
    public Boolean editPurchase(Purchase purchase, String name) {
        if (name != null) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    // EFFECTS: produces edit feedback message
    public String editFeedback(boolean feedback) {
        if (feedback) {
            return "Purchase was successfully edited.";
        } else {
            return "Error: Purchase could not be edited.";
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
