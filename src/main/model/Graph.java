package model;

import java.util.ArrayList;
import java.util.List;

// Represents a pie graph containing a list of categories and stats about each
// category and cumulative stats
public class Graph {

    private List<Category> categoryList;
    private double ultimateSpent;

    // EFFECTS: constructs a new graph with an empty list
    public Graph() {
        this.categoryList = new ArrayList<>();
        this.ultimateSpent = 0;
    }

    // MODIFIES: this
    // EFFECTS: adds up amt spent in each category of graph
    public double determineUltimateSpent() {
        for (Category category : this.categoryList) {
            this.ultimateSpent += category.getTotalSpent();
        }
        return ultimateSpent;
    }

    // MODIFIES: this
    // EFFECTS: resets total spent field
    public double resetUltimateSpent() {
        return this.ultimateSpent = 0;
    }

    // MODIFIES: this
    // EFFECTS: adds Category to Graph
    public String addCategory(Category category) {
        if (this.categoryList.contains(category)) {
            return "Category wasn't added";
        }
        categoryList.add(category);
        return "Category successfully added.";
    }

    // MODIFIES: this
    // EFFECTS: removes Category from Graph
    public String removeCategory(Category category) {
        if (this.categoryList.contains(category)) {
            categoryList.remove(category);
            return "Category successfully removed.";
        }
        return "Category was not removed.";
    }

    // EFFECTS: gives message about ultimate spent
    public String ultimateSpentMessage(User user) {
        return "You have spent " + this.ultimateSpent + " of your "
                + user.getIncome() + " total dollars.";
    }

    // EFFECTS: gives message about stats of Category
    public String categoryMessage(Category category) {
        return category.getName() + ": " + category.getRemainingMoney() + " dollars remaining";
    }

    public double getUltimateSpent() {
        return ultimateSpent;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }
}
