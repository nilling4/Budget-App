//package ui;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class UserWindow implements ActionListener {
//
//    private JFrame frame;
//    private JLabel selectLabel;
//    private JLabel userLabel;
//    private JPanel panel;
//    private JButton[] userButtons = new JButton[3];
//    private JButton newUserButton;
//    private JButton increaseButton;
//    private JButton decreaseButton;
//    private NewUserWindow newUserWindow;
//
//    private Font font = new Font("HelveticaNeue", Font.BOLD, 30);
//
//    // EFFECTS: creating user window
//    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
//    public UserWindow() {
//        frame = new JFrame("User profile");
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//        frame.setSize(600, 450);
//        frame.setVisible(true);
//
//        selectLabel = new JLabel("Select one of the following.");
//
//        selectLabel.setFont(font);
//        selectLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//        newUserButton = new JButton("New User");
//        increaseButton = new JButton("Increase budget");
//        decreaseButton = new JButton("Decrease budget");
//        newUserButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        increaseButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        decreaseButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//        userButtons[0] = newUserButton;
//        userButtons[1] = increaseButton;
//        userButtons[2] = decreaseButton;
//
//        for (int i = 0; i < 3; i++) {
//            userButtons[i].addActionListener(this);
//            userButtons[i].setFont(font);
//            userButtons[i].setFocusable(false);
//        }
//
//        panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.setBorder(new EmptyBorder(new Insets(10, 80, 50, 80)));
//        panel.setBackground(Color.lightGray);
//        panel.add(selectLabel);
////        setLabel();
////        panel.add(Box.createRigidArea(new Dimension(0, 100)));
////        panel.add(userLabel);
//        panel.add(Box.createRigidArea(new Dimension(0, 10)));
//        panel.add(newUserButton);
//        panel.add(Box.createRigidArea(new Dimension(0, 10)));
//        panel.add(increaseButton);
//        panel.add(Box.createRigidArea(new Dimension(0, 10)));
//        panel.add(decreaseButton);
//        panel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        panel.setVisible(true);
//        frame.add(panel);
//    }
//
////    public void setLabel() {
////        userLabel = new JLabel("");
////        userLabel.setFont(font);
////        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
////
////    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if (e.getSource() == newUserButton) {
//            newUserWindow = new NewUserWindow();
//        } else if (e.getSource() == increaseButton) {
//            IncreaseWindow increaseWindow = new IncreaseWindow();
//        } else if (e.getSource() == decreaseButton) {
//            DecreaseWindow decreaseWindow = new DecreaseWindow();
//        }
//    }
//}