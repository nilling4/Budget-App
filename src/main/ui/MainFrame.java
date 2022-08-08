//package ui;
//
//import model.Category;
//import model.User;
//import persistence.JsonReader;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//
//public class MainFrame implements ActionListener {
//
//    private static final String JSON_STORE_CATEGORY_1 = "./data/category1.json";
//    private static final String JSON_STORE_CATEGORY_2 = "./data/category2.json";
//    private static final String JSON_STORE_CATEGORY_3 = "./data/category3.json";
//    private static final String JSON_STORE_GRAPH = "./data/graph.json";
//    private static final String JSON_STORE_USER = "./data/user.json";
//
//    private JFrame frame;
//    private int income;
//    private JTextField textField;
//    private JButton[] optionButtons = new JButton[2];
//    private JButton[] persistenceButtons = new JButton[2];
//    private JButton categoryButton;
//    private JButton saveButton;
//    private JButton loadButton;
//    private JButton userButton;
//    private JPanel panel;
//    private JLabel label;
//    private NewUserWindow newUserWindow;
//    private JsonReader jsonReaderUser;
//    private User mainUser;
//
//
//    private Font myFont = new Font("HelveticaNeue", Font.BOLD, 30);
//
//    public void setUser(User user) {
//        mainUser = user;
//    }
//
//    // main method
//    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
//    public MainFrame() {
//
//        // Creating a new frame to store text field and
//        // button
//        frame = new JFrame("UniBudget");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 610);
//
////        textField = new JTextField();
////        textField.setBounds(50, 25, 300, 50);
////        textField.setFont(myFont);
//
//        // Creating a label to display text
//        label = new JLabel("UniSave BudgetApp");
//        label.setFont(myFont);
//        label.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//        // Creating buttons
//        categoryButton = new JButton("Categories");
//        userButton = new JButton("User profile");
//        saveButton = new JButton("Save files");
//        loadButton = new JButton("Load files");
//        categoryButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        userButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        loadButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        saveButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//
//        optionButtons[0] = categoryButton;
//        optionButtons[1] = userButton;
//
//        persistenceButtons[0] = saveButton;
//        persistenceButtons[1] = loadButton;
//
//        for (int i = 0; i < 2; i++) {
//            optionButtons[i].addActionListener(this);
//            optionButtons[i].setFont(myFont);
//            optionButtons[i].setFocusable(false);
//        }
//
//        for (int i = 0; i < 2; i++) {
//            persistenceButtons[i].addActionListener(this);
//            persistenceButtons[i].setFont(myFont);
//            persistenceButtons[i].setFocusable(false);
//        }
//
//        // Creating a panel to add buttons and
//        // textfield and a layout
//        panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.setBorder(new EmptyBorder(new Insets(10, 80, 50, 80)));
//
//        panel.add(label);
//        panel.add(Box.createRigidArea(new Dimension(0, 250)));
//        panel.add(categoryButton);
//        panel.add(Box.createRigidArea(new Dimension(0, 10)));
//        panel.add(userButton);
//        panel.add(Box.createRigidArea(new Dimension(0, 10)));
//        panel.add(loadButton);
//        panel.add(Box.createRigidArea(new Dimension(0, 10)));
//        panel.add(saveButton);
//        //panel.add(textField);
//        panel.setVisible(true);
//
//        panel.setBackground(Color.lightGray);
//
//        frame.add(panel);
//        frame.show();
//    }
//
//
//    public static void main(String[] args) {
//
//        MainFrame mainFrame = new MainFrame();
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == userButton) {
////            newUserWindow = new NewUserWindow();
//        } else if (e.getSource() == categoryButton) {
//            CategoriesWindow categoriesWindow = new CategoriesWindow();
//        } else if (e.getSource() == saveButton) {
//            saveUser();
//        } else if (e.getSource() == loadButton) {
//            jsonReaderUser = new JsonReader(JSON_STORE_USER);
//            loadUser();
//        }
//    }
//}
