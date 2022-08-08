package ui;

import model.User;
import persistence.JsonReader;
import persistence.JsonWriter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewUserWindow implements ActionListener, KeyListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel nameLabel;
    private JTextField incomeText;
    private JLabel incomeLabel;
    private JTextField nameText;
    private JButton button;
    private User newUser;
    private JLabel message;
    private JsonWriter jsonWriterUser;
    private JsonReader jsonReaderUser;
    private static final String JSON_STORE_USER = "./data/user.json";
    private CategoriesWindow categoriesWindow;

    public NewUserWindow(CategoriesWindow categoriesWindow) {
        this.categoriesWindow = categoriesWindow;
        frameSetUp();
    }

    public void frameSetUp() {
        frame = new JFrame("New User");
        panel = new JPanel();
        frame.setSize(300, 220);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        nameLabelSetUp();
        incomeLabelSetUp();
        incomeTextSetUp();
        setNameText();
        setButton();
        messageLabel();
        frame.setVisible(true);


    }

    public void setNameText() {
        nameText = new JTextField(10);
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);
    }

    public void nameLabelSetUp() {
        nameLabel = new JLabel("User");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);
    }

    public void incomeLabelSetUp() {
        incomeLabel = new JLabel("Income");
        incomeLabel.setBounds(10, 50, 80, 25);
        panel.add(incomeLabel);
    }

    public void incomeTextSetUp() {
        incomeText = new JTextField(20);
        incomeText.setBounds(100, 50, 165, 25);
        panel.add(incomeText);
        incomeText.addKeyListener(this);
    }

    public void setButton() {
        button = new JButton("Set User");
        button.setBounds(10, 80, 110, 25);
        button.addActionListener(this);
        panel.add(button);
    }

    public String getName() {
        return nameLabel.getText();
    }

    public double getIncome() {
        return Double.parseDouble(incomeText.getText());
    }

    public void messageLabel() {
        message = new JLabel("");
        message.setBounds(10, 120, 200, 25);
        panel.add(message);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameText.getText();
        double income = Double.parseDouble(incomeText.getText());
        newUser = new User(income, name);
        categoriesWindow.setUser(newUser);
        System.out.println(name + " , " + income);

        message.setText("User: " + name + "         Income: " + income);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = nameText.getText();
            double income = Double.parseDouble(incomeText.getText());
            newUser = new User(income, name);
            categoriesWindow.setUser(newUser);
            System.out.println(name + " , " + income);

            message.setText("User: " + name + "         Income: " + income);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }


}
