package model;

// Represents an item purchased with a name and cost
public class Purchase {
    private String name;
    private double cost;

    // REQUIRES:
    // MODIFIES:
    // EFFECTS:
    public Purchase(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    // REQUIRES: new name cannot be ""
    // MODIFIES: this
    // EFFECTS: produces true if name successfully added, false otherwise
    public String editPurchase(String name) {
        if (name != this.name) {
            this.name = name;
            return "Purchase was successfully edited.";
        } else {
            return "Error: Purchase could not be edited.";
        }
    }

//    // EFFECTS: produces edit feedback message
//    public String editFeedback(boolean feedback) {
//        if (feedback) {
//            return "Purchase was successfully edited.";
//        } else {
//            return "Error: Purchase could not be edited.";
//        }
//    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
