package ru.javabegin.training.fastjava2.javafx.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.javabegin.training.fastjava2.javafx.controllers.MainController;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    private static final Locale DEFAULT_LOCALE = new Locale("en");

    @Override
    public void start(Stage primaryStage) throws Exception{

        Locale.setDefault(DEFAULT_LOCALE);

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../fxml/main.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("ru.javabegin.training.fastjava2.javafx.bundles.Locale"));

        Parent fxmlMain = fxmlLoader.load();
        MainController mainController = fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.setTitle(fxmlLoader.getResources().getString("address_book"));
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(fxmlMain, 300, 275));
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
