package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CategoriesWindow implements ActionListener {
    // make abstract class spring form that category and user use to make new items

    JFrame frame;
    JTable table;
    JLabel label;
    JTextField textName;
    JTextField textCost;
    JButton buttonAdd;
    JComboBox comboBox;
    String[] categories = {"food", "fun", "transport"};
    Object[] row;
    DefaultTableModel model;

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    CategoriesWindow() {

        frame = new JFrame();
        table = new JTable();
        label = new JLabel("Select from an option below.");
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        // create a table model and set a Column Identifiers to this model
        Object[] columns = {"Item Name","Cost", "Category"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);

        // create JTextFields
        textName = new JTextField();
        textCost = new JTextField();

        // create JButtons
        buttonAdd = new JButton("Add");

        // create JComboBox
        comboBox = new JComboBox(categories);

        textName.setBounds(20, 220, 100, 25);
        textCost.setBounds(20, 250, 100, 25);
        comboBox.setBounds(20, 280, 100, 25);
        buttonAdd.setBounds(150, 220, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);

        frame.setLayout(null);

        frame.add(pane);

        // add JTextFields to the jframe
        frame.add(textName);
        frame.add(textCost);

        // add JButtons to the jframe
        frame.add(buttonAdd);
        frame.add(comboBox);

        // create an array of objects to set the row data
        row = new Object[3];

        addButton();

        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);

    }

    public void selectPanel() {
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String categoryName = (String) comboBox.getSelectedItem();
                row[2] = categoryName;
            }
        });
    }

    public void addButton() {
        // button add row
        buttonAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = textName.getText();
                row[1] = textCost.getText();

                // add row to the model
                selectPanel();
                model.addRow(row);
            }

        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

