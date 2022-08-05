package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] optionButtons = new JButton[2];
    JButton[] persistenceButtons = new JButton[2];
    JButton categoryButton;
    JButton saveButton;
    JButton loadButton;
    JButton userButton;
    JPanel panel;

    Font myFont = new Font("HelveticaNeue", Font.BOLD, 30);

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public MainFrame() {
        frame = new JFrame("UniBudget");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);

        categoryButton = new JButton("Category");
        userButton = new JButton("User profile");
        saveButton = new JButton("Save files");
        loadButton = new JButton("Load files");


        optionButtons[0] = categoryButton;
        optionButtons[1] = userButton;

        persistenceButtons[0] = saveButton;
        persistenceButtons[1] = loadButton;

        for (int i = 0; i < 2; i++) {
            optionButtons[i].addActionListener(this);
            optionButtons[i].setFont(myFont);
            optionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 2; i++) {
            persistenceButtons[i].addActionListener(this);
            persistenceButtons[i].setFont(myFont);
            persistenceButtons[i].setFocusable(false);
        }

        categoryButton.setBounds(200, 430, 145, 50);
        userButton.setBounds(200, 300, 145, 50);
        loadButton.setBounds(200, 100, 145, 50);
        saveButton.setBounds(200, 50, 145, 50);

        frame.add(categoryButton);
        frame.add(userButton);
        frame.add(loadButton);
        frame.add(saveButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
