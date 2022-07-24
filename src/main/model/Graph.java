package model;

import java.util.ArrayList;
import java.util.List;

// Represents a pie graph containing a list of categories and stats about each
// category and cumulative stats
public class Graph {

    private List<Category> categoryList;
    private double ultimateSpent;

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: constructs a new graph with an empty list
    public Graph() {
        this.categoryList = new ArrayList<>();
        this.ultimateSpent = 0;
    }

    // REQUIRES:
    // MODIFIES: this
    // EFFECTS: adds Category to Graph
    public Boolean addCategory(Category category) {
        if (this.categoryList.contains(category)) {
            return false;
        }
        categoryList.add(category);
        return true;
    }

    // REQUIRES:
    // MODIFIES: this
    // EFFECTS: removes Category from Graph
    public Boolean removeCategory(Category category) {
        if (this.categoryList.contains(category)) {
            categoryList.remove(category);
            return true;
        }
        return false;
    }

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: gives message about addCategory
    public String addCategoryText(boolean success) {
        if (success) {
            return "Category successfully added.";
        }
        return "Category wasn't added";
    }

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: gives message about removeCategory
    public String removeCategoryText(boolean success) {
        if (success) {
            return "Category successfully removed.";
        }
        return "Category was not removed.";
    }

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: gives message about removeCategory
    public String ultimateSpentMessage(User user) {
        return "You have spent " + this.ultimateSpent + "of your"
                + user.getIncome() + "total dollars.";
    }

    // REQUIRES:
    // MODIFIES:
    // EFFECTS: gives message about stats of Category
    public String categoryMessage(Category category) {
        return category.getName() + ":" + category.getRemainingMoney() + "dollars remaining";
    }

    public double getUltimateSpent() {
        return ultimateSpent;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }







}
