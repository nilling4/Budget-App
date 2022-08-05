package ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
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
    JLabel label;

    Font myFont = new Font("HelveticaNeue", Font.BOLD, 30);

    // main method
    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public MainFrame() {

        // Creating a new frame to store text field and
        // button
        frame = new JFrame("UniBudget");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 610);

//        textField = new JTextField();
//        textField.setBounds(50, 25, 300, 50);
//        textField.setFont(myFont);

        // Creating a label to display text
        label = new JLabel("UniSave BudgetApp");
        label.setFont(myFont);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Creating buttons
        categoryButton = new JButton("Categories");
        userButton = new JButton("User profile");
        saveButton = new JButton("Save files");
        loadButton = new JButton("Load files");
        categoryButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        userButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        saveButton.setAlignmentX(Component.CENTER_ALIGNMENT);


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

//        categoryButton.setBounds(200, 430, 145, 50);
//        userButton.setBounds(200, 300, 145, 50);
//        loadButton.setBounds(200, 100, 145, 50);
//        saveButton.setBounds(200, 50, 145, 50);

        // Creating a panel to add buttons and
        // textfield and a layout
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(new Insets(10, 80, 50, 80)));

        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 250)));
        panel.add(categoryButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(userButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(loadButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(saveButton);
        //panel.add(textField);
        panel.setVisible(true);

        panel.setBackground(Color.BLUE);

        frame.add(panel);
        frame.show();
    }


    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userButton) {
            // frame.dispose();
            NewWindow myWindow = new NewWindow();
        } else if (e.getSource() == categoryButton) {
            // frame.dispose();
            NewWindow myWindow = new NewWindow();
        } else if (e.getSource() == saveButton) {
            // frame.dispose();
            NewWindow myWindow = new NewWindow();
        } else if (e.getSource() == loadButton) {
            // frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
