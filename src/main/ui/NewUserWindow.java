package ui;

import javax.swing.*;

public class NewUserWindow {

    private JFrame frame;
    private JPanel panel;
    private JLabel nameLabel;
    private JTextField nameText;
    private JLabel incomeLabel;
    private JTextField incomeText;

    public NewUserWindow() {
        frameSetUp();
    }

    public void frameSetUp() {
        frame = new JFrame("New User");
        panel = new JPanel();
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        nameTextSetUp();
        nameLabelSetUp();
        incomeLabelSetUp();
        incomeTextSetUp();

        frame.setVisible(true);
    }

    public void nameLabelSetUp() {
        nameLabel = new JLabel("User");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);
    }

    public void nameTextSetUp() {
        nameText = new JTextField(10);
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);
    }

    public void incomeLabelSetUp() {
        incomeLabel = new JLabel("Income");
        incomeLabel.setBounds(10, 50, 80, 25);
        panel.add(incomeLabel);
    }

    public void incomeTextSetUp() {
        incomeText = new JTextField(20);
        nameText.setBounds(100, 50, 165, 25);
        panel.add(incomeText);
    }


}
