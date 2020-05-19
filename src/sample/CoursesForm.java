package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoursesForm extends JFrame {

    private JPanel mainPanel;
    private JPanel btnsPanel;

    private JButton addBtn;
    private JButton cancelBtn;

    private JLabel name;
    private JLabel section;
    private JLabel hours;

    private JTextField nameField;
    private JTextField sectionField;
    private JTextField hoursField;

    public CoursesForm(String title) {
        super(title);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Create the main panel
        mainPanel = new JPanel(new GridLayout(8, 2, 0, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        add(mainPanel, BorderLayout.CENTER);

        // Create the bottom panel
        addBtn = new JButton("Save");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Save student into the DB
            }
        });

        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main form = new Main("Main Menu");
                CoursesForm.this.setVisible(false);
                form.setVisible(true);
            }
        });

        btnsPanel = new JPanel();
        btnsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnsPanel.add(addBtn);
        btnsPanel.add(cancelBtn);
        add(btnsPanel, BorderLayout.SOUTH);

        createMainComponents(mainPanel);
    }

    private void createMainComponents(JPanel panel) {
        name = new JLabel("Course Name");
        section = new JLabel("Course Section");
        hours = new JLabel("Hours");

        nameField = new JTextField(12);
        sectionField = new JTextField(12);
        hoursField = new JTextField(12);

        panel.add(name);
        panel.add(nameField);
        panel.add(section);
        panel.add(sectionField);
        panel.add(hours);
        panel.add(hoursField);
    }
}
