package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class inicioHBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

        @Override
        public void start (Stage primaryStage){
        Button btn1 = new Button("Botón 1");
        Button btn2 = new Button("Botón 2");
        Button btn3 = new Button("Botón 3");

        HBox hbox = new HBox();
        hbox.getChildren().addAll(btn1, btn2, btn3);

        // Cambiar espaciado entre componentes
        hbox.setSpacing(10);

        // Cambiar padding 1. al borde superior, 2. al borde derecho, 3. al borde de abajo,
        //4. al borde izquierdo. Es igual que el padding de CSS

        hbox.setPadding(new Insets(10, 20, 10, 20));
        // Cambiar margin
        // HBox.setMargin(btn2, new Insets(30));

        //Escena
        Scene scene = new Scene(hbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Layout HBox");
        primaryStage.show();

        }
    }

