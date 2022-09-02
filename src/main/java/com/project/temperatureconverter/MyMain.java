package com.project.temperatureconverter;

import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("init"); // Initialize your application
        super.init();
    }

    // Start the Application and give the Stage.
    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("start"); // Starts an application

        FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
        VBox rootNode = loader.load();

        // MenuBar
        MenuBar menuBar = createMenu();
        rootNode.getChildren().add(0,menuBar);

        Scene scene = new Scene(rootNode);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Temperature Converter");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private MenuBar createMenu() {
        Menu fileMenu = new Menu("Option");
        MenuItem quitMenuItem = new MenuItem("Quit");
        quitMenuItem.setOnAction(event -> {
            Platform.exit();
            System.exit(0);
        });
        fileMenu.getItems().addAll(quitMenuItem);

        Menu helpManu = new Menu("Help");
        MenuItem aboutMenuItem = new MenuItem("About");
        aboutMenuItem.setOnAction(event -> aboutApp());
        helpManu.getItems().addAll(aboutMenuItem);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, helpManu);
        return menuBar;
    }

    // About Section
    public static void aboutApp() {
        Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
        alertDialog.setTitle("About App and Me");
        alertDialog.setHeaderText("Temperature Converter");
        alertDialog.setContentText("Hey, My Name is Neeraj Fullara. Right now I'm a beginner soon I'll be a best in it. This is trial based app.");

        ButtonType okBtn = new ButtonType("Ok");

        alertDialog.getButtonTypes().setAll(okBtn);

        Optional<ButtonType> clickedBtn = alertDialog.showAndWait();

        if (clickedBtn.isPresent() && clickedBtn.get() == okBtn) {
            System.out.println("Ok button is clicked");
        }
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop"); // it is called when Application closed Stops the application
        super.stop();
    }
}