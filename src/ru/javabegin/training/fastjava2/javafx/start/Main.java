package ru.javabegin.training.fastjava2.javafx.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.javabegin.training.fastjava2.javafx.interfaces.impls.CollectionAddressBook;
import ru.javabegin.training.fastjava2.javafx.objects.Person;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
        primaryStage.setTitle("Адресная книга");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        testData();
    }

    private void testData() {
//        CollectionAddressBook addressBook = new CollectionAddressBook();
//        addressBook.fillTestData();
//        addressBook.print();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
