package com.example.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class vBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Crear label de nombre de usuario
        Label label_username = new Label("Nombre de usuario: ");

        //Crear un campo de texto para el usuario
        TextField field_username = new TextField();

        //Crear label para password
        Label label_password = new Label("Clave: ");

        //Crear un campo de texto para el clave
        PasswordField field_password = new PasswordField();

        //Crear botón para enviar
        Button button_send = new Button("Enviar");

        // Creamos una lista de controles
        ObservableList<Control> controls =
                FXCollections.observableArrayList(label_username,
                        field_username,
                        label_password, field_password, button_send);


        //Crearmos la caja vertical
        VBox vbox = new VBox();

        // Añadimos nuestra lista de controles al Vbox
        vbox.getChildren().addAll(controls);
        vbox.setPadding(new Insets(20));
        vbox.setSpacing(10);

        // Alineación
        vbox.setAlignment(Pos.CENTER);

        //Escena
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setTitle("Demo de VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
