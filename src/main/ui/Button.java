package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {

    private JButton button;

    public Button(String name) {
        button = new JButton(name);

        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
           // frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
