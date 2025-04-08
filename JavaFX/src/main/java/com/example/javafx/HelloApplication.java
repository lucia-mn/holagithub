package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        VBox vBox = new VBox(new Label("javafx"));
        Scene scene = new Scene(vBox);

        //Stage stage = new Stage();
        stage.setTitle("Aplicación JavaFX");

        //posicionar
        stage.setX(50);
        stage.setY(50);

        //dimensionar
        stage.setWidth(600);
        stage.setHeight(300);


        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}