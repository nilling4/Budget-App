package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewUserWindow implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel nameLabel;
    private JTextField incomeText;
    private JLabel incomeLabel;
    private JTextField nameText;
    private JButton button;

    public NewUserWindow() {
        frameSetUp();
    }

    public void frameSetUp() {
        frame = new JFrame("New User");
        panel = new JPanel();
        frame.setSize(300, 170);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        nameLabelSetUp();
        incomeLabelSetUp();
        incomeTextSetUp();
        setNameText();
        setButton();

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
    }

    public void setButton() {
        button = new JButton("Set User");
        button.setBounds(10, 80, 110, 25);
        button.addActionListener(this);
        panel.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameText.getText();
        int income = Integer.parseInt(incomeText.getText());
        System.out.println(name + " , " + income);
    }
}
