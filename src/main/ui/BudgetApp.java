package ui;

import model.Category;
import model.Graph;

import java.util.Locale;
import java.util.Scanner;

// Budget application
public class BudgetApp {
    private Graph mainGraph;
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

        System.out.println("\nGoodbye!");
    }

    // MODIFIES: this
    // EFFECTS: processes user command
    private void processCommand(String command) {
        if (command.equals("c")) {
            doCategory();
        } else if (command.equals("g")) {
            doGraph();
        } else if (command.equals("u")) {
            doUser();
        } else {
            System.out.println("Please select a valid option...");
        }
    }

    // MODIFIES: this
    // EFFECTS: initializes graph
    private void init() {
        mainGraph = new Graph();
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
    // EFFECTS: initializes graph
    private void doCategory() {

    }

    // MODIFIES: this
    // EFFECTS: initializes graph
    private void doGraph() {

    }

    // MODIFIES: this
    // EFFECTS: initializes graph
    private void doUser() {
        
    }

}
