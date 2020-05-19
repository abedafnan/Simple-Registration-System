package sample;

import sample.models.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentsForm extends JFrame {

    private JPanel mainPanel;
    private JPanel btnsPanel;

    private JButton addBtn;
    private JButton cancelBtn;

    private JLabel firstName;
    private JLabel lastName;
    private JLabel email;
    private JLabel country;
    private JLabel city;
    private JLabel error;

    private JTextField fnameField;
    private JTextField lnameFiled;
    private JTextField emailField;
    private JTextField cityField;
    private JTextField countryField;

    public StudentsForm(String title) {
        super(title);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Create the main panel
        mainPanel = new JPanel(new GridLayout(8, 2, 0, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        add(mainPanel, BorderLayout.CENTER);
        createMainComponents(mainPanel);

        // Create the bottom panel
        addBtn = new JButton("Save");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create student and save it into the DB
                Student student = getStudentInfo();
                saveStudentInDB(student);
            }
        });

        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main form = new Main("Main Menu");
                StudentsForm.this.setVisible(false);
                form.setVisible(true);
            }
        });

        btnsPanel = new JPanel();
        btnsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnsPanel.add(addBtn);
        btnsPanel.add(cancelBtn);
        add(btnsPanel, BorderLayout.SOUTH);
    }

    private void createMainComponents(JPanel panel) {
        firstName = new JLabel("First Name");
        lastName = new JLabel("Last Name");
        email = new JLabel("Email");
        country = new JLabel("Country");
        city = new JLabel("City");

        fnameField = new JTextField(12);
        lnameFiled = new JTextField(12);
        emailField = new JTextField(12);
        countryField = new JTextField(12);
        cityField = new JTextField(12);

        panel.add(firstName);
        panel.add(fnameField);
        panel.add(lastName);
        panel.add(lnameFiled);
        panel.add(email);
        panel.add(emailField);
        panel.add(country);
        panel.add(countryField);
        panel.add(city);
        panel.add(cityField);

        error = new JLabel();
        panel.add(error);
    }

    private Student getStudentInfo() {
        String firstName = fnameField.getText();
        String lastName = lnameFiled.getText();
        String email = emailField.getText();
        String country = countryField.getText();
        String city = cityField.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
            error.setForeground(Color.RED);
            error.setText("first name, last name, and email are required");
        }

        Student.Builder builder = new Student.Builder();
        builder.setFirstName(firstName);
        builder.setLastName(lastName);
        builder.setEmail(email);
        builder.setCountry(city);
        builder.setCity(country);

        return builder.build();
    }

    private void saveStudentInDB(Student student) {

    }
}
