package ui;

import model.Category;
import model.Graph;
import model.Purchase;
import model.User;

import java.util.Scanner;

// Budget application
// used the TellerApp as reference for making the UI
public class BudgetApp {
    private Graph mainGraph;
    private User mainUser;
    private Category category1;
    private Category category2;
    private Category category3;
    private Scanner input;

    // EFFECTS: runs the budget application
    public BudgetApp() {
        runBudget();
    }

    // MODIFIES: this
    // EFFECTS; processes user input
    private void runBudget() {
        boolean keepGoing = true;
        String command = null;

        init();

        while (keepGoing) {
            displayMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processCommand(command);
            }
        }

        System.out.println("\nHave a good day!");
    }

    // MODIFIES: this
    // EFFECTS: processes user command
    private void processCommand(String command) {
        if (command.equals("c")) {
            runCategory();
        } else if (command.equals("g")) {
            runGraph();
        } else if (command.equals("u")) {
            runUser();
        } else {
            System.out.println("Please select a valid option...");
        }
    }

    // MODIFIES: this
    // EFFECTS: initializes main
    private void init() {
        mainGraph = new Graph();
        mainUser = new User(0, "unnamed");
        category1 = new Category("Food", 0);
        category2 = new Category("Transport", 0);
        category3 = new Category("Fun", 0);
        mainGraph.addCategory(category1);
        mainGraph.addCategory(category2);
        mainGraph.addCategory(category3);

        input = new Scanner(System.in);
        input.useDelimiter("\n");
    }

    // MODIFIES: this
    // EFFECTS: initializes user
    private void initUser() {
        input = new Scanner(System.in);
        input.useDelimiter("\n");
    }

    // MODIFIES: this
    // EFFECTS: initializes graph
    private void initGraph() {
        input = new Scanner(System.in);
        input.useDelimiter("\n");
    }

    // MODIFIES: this
    // EFFECTS: initializes category
    private void initCategory() {
        input = new Scanner(System.in);
        input.useDelimiter("\n");
    }

    // EFFECTS: displays menu of options to user
    private void displayMenu() {
        System.out.println("\nSelect what you want to do:");
        System.out.println("\tc -> categories");
        System.out.println("\tg -> graph");
        System.out.println("\tu -> user");
        System.out.println("\tq -> quit");
    }

    // MODIFIES: this
    // EFFECTS: lets you update user
    private void runUser() {
        boolean keepGoing = true;
        String command = null;

        initUser();

        while (keepGoing) {
            userMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processUserCommand(command);
            }
        }
    }

    // MODIFIES: this
    // EFFECTS: process command for user setting
    private void processUserCommand(String command) {
        if (command.equals("n")) {
            newUser();
        } else if (command.equals("+")) {
            increaseUser();
        } else if (command.equals("-")) {
            decreaseUser();
        } else {
            System.out.println("Please select a valid option...");
        }
    }

    // MODIFIES: this
    // EFFECTS: lets you update user
    private void userMenu() {
        System.out.println("\nSelect what you want to do:");
        System.out.println("\tn -> new user");
        System.out.println("\t+ -> increase budget");
        System.out.println("\t- -> decrease budget");
        System.out.println("\tq -> quit to main menu");
    }

    // MODIFIES: this
    // EFFECTS: lets you make new user
    private void newUser() {
        System.out.println("\nIncome?");
        double income = input.nextDouble();

        System.out.println("\nNew user name?");
        input.nextLine();
        String name = input.nextLine();

        mainUser.renameUser(name);
        mainUser.increaseMoney(income);

        System.out.println("\nHello " + name);
        printIncome(mainUser);
    }

    // MODIFIES: this
    // EFFECTS: lets you increase user income
    private void increaseUser() {
        System.out.println("\nHow much do you want to increase budget by?");
        double income = input.nextDouble();
        System.out.println(mainUser.increaseMoney(income));
        printIncome(mainUser);
    }

    // MODIFIES: this
    // EFFECTS: lets you decrease user income
    private void decreaseUser() {
        System.out.println("How much do you want to decrease budget by?");
        double income = input.nextDouble();
        System.out.println(mainUser.decreaseMoney(income, mainGraph));
        printIncome(mainUser);
    }

    // EFFECTS: prints user income to screen
    private void printIncome(User user) {
        System.out.println("Budget: " + user.getIncome());
    }

    // MODIFIES: this
    // EFFECTS: lets you run graph setting
    private void runGraph() {
        boolean keepGoing = true;
        String command = null;

        initGraph();

        while (keepGoing) {
            graphMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processGraphCommand(command);
            }
        }
    }

    // MODIFIES: this
    // EFFECTS: process command for graph setting
    private void processGraphCommand(String command) {
        if (command.equals("u")) {
            checkTotalGraph();
        } else {
            System.out.println("Please select a valid option...");
        }
    }

    // MODIFIES: this
    // EFFECTS: menu for graph setting
    private void graphMenu() {
        System.out.println("\nSelect what you want to do:");
        System.out.println("\tu -> check total spent");
        System.out.println("\tq -> quit to main menu");
    }

    // EFFECTS: lets you see total spending by user
    private void checkTotalGraph() {
        mainGraph.resetUltimateSpent();
        mainGraph.determineUltimateSpent();
        System.out.println(mainGraph.ultimateSpentMessage(mainUser));
    }

    // MODIFIES: this
    // EFFECTS: lets you update category
    private void runCategory() {
        boolean keepGoing = true;
        String command = null;

        initCategory();

        while (keepGoing) {
            categoryMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processCategoryCommand(command);
            }
        }
    }

    // MODIFIES: this
    // EFFECTS: process command for category setting
    private void processCategoryCommand(String command) {
        if (command.equals("a")) {
            addPurchase();
        } else {
            System.out.println("Please select a valid option...");
        }
    }

    // MODIFIES: this
    // EFFECTS: menu for category setting
    private void categoryMenu() {
        System.out.println("\nSelect what you want to do:");
        System.out.println("\ta -> add purchase");
        System.out.println("\tq -> quit to main menu");
    }

    // EFFECTS: prompts user to select category they want to edit and returns it
    private Category selectCategory() {
        String selection = ""; // force entry into loop

        while (!(selection.equals("f") || selection.equals("t") || selection.equals("!"))) {
            System.out.println("press f for food");
            System.out.println("press t for transport");
            System.out.println("press ! for fun");
            selection = input.next();
            selection = selection.toLowerCase();
        }

        if (selection.equals("f")) {
            return category1;
        } else if (selection.equals("t")) {
            return category2;
        } else {
            return category3;
        }
    }

    // MODIFIES: this
    // EFFECTS: adds purchase to given category
    private void addPurchase() {
        Category selected = selectCategory();
        System.out.println("\nCost?");
        double cost = input.nextDouble();

        System.out.println("\nName of purchase?");
        input.nextLine();
        String name = input.nextLine();

        Purchase purchase = new Purchase(name, cost);
        System.out.println(selected.addPurchase(purchase));
        selected.resetTotalSpent();
        selected.updateCategory(mainUser);
        printCategory(selected);
    }

    // EFFECTS: prints the category to the screen
    private void printCategory(Category selected) {
        System.out.println("Purchased items in " + selected.getName() + " category:");
        System.out.println(" ");
        for (Purchase purchase : selected.getListPurchases()) {
            System.out.println("-" + " " + purchase.getName() + "  $" + purchase.getCost());
        }
    }
}
