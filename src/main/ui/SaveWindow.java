package ui;

import javax.swing.*;
import java.awt.*;

public class SaveWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    SaveWindow() {

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
