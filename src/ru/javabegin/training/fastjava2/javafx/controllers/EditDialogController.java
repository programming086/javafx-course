package ru.javabegin.training.fastjava2.javafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.javabegin.training.fastjava2.javafx.objects.Person;


public class EditDialogController {

    @FXML
    private Button btnOk;

    @FXML
    private Button btnCancel;

    @FXML
    private TextField txtFIO;

    @FXML
    private TextField txtPhone;

    private Person person;


    public void actionClose(ActionEvent actionEvent) {
        Node  source = (Node)  actionEvent.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }



    public void setPerson(Person person) {
        this.person = person;

        txtFIO.setText(person.getFio());
        txtPhone.setText(person.getPhone());
    }


}
