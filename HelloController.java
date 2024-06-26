package com.example.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField studentIdField;

    @FXML
    private TextField studentNameField;

    @FXML
    private TextField moduleNameField;

    @FXML
    private TextField timeField;

    @FXML
    private TextField moduleIdField;

    @FXML
    private TextField lecturerNameField;

    @FXML
    private Button addButton;

    @FXML
    private Button getDetailsButton;

    @FXML
    private Button saveAndQuitButton;

    @FXML
    private Button registerModuleButton;

    @FXML
    private Button listModulesButton1;

    @FXML
    private Button listModulesButton2;

    @FXML
    private Button recordMarksButton;

    @FXML
    private TextArea textArea1;

    @FXML
    private TextArea textArea2;

    @FXML
    private void handleAddButtonAction() {
        String studentId = studentIdField.getText();
        String studentName = studentNameField.getText();
        String moduleName = moduleNameField.getText();
        String time = timeField.getText();
        String moduleId = moduleIdField.getText();
        String lecturerName = lecturerNameField.getText();

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Module Name: " + moduleName);
        System.out.println("Time: " + time);
        System.out.println("Module ID: " + moduleId);
        System.out.println("Lecturer Name: " + lecturerName);
    }
}
