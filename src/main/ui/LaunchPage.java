package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton saveButton = new JButton("Save");
    JButton categoriesButton = new JButton("Categories");
    JButton graphMyButton = new JButton("Graph");
    JButton userProfileButton = new JButton("User Profile");
    JButton loadButton = new JButton("Load");

    LaunchPage() {

        userProfileButton.setBounds(100, 160, 200, 40);
        userProfileButton.setFocusable(false);
        userProfileButton.addActionListener(this);

        saveButton.setBounds(100, 160, 200, 40);
        saveButton.setFocusable(false);
        saveButton.addActionListener(this);

        frame.add(userProfileButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setTitle("UniBudget");
//        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userProfileButton) {
            // frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
