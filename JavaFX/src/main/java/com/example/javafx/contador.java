package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class contador extends Application {
    private int contador = 0;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        //Creación de la caja vertical
        VBox vbox = new VBox();

        //Crear botones para sumar 1 y reiniciar
        Button btnSumar = new Button("Sumar");
        Button btnReiniciar = new Button("Reiniciar");

        //Crear labels con el resultado
        Label lblResultado = new Label("0");

        //Añadir al vbox los botones y el label
        vbox.getChildren().addAll(btnSumar, btnReiniciar, lblResultado);

        // Asociar evento con lambda expression
        btnSumar.setOnAction( event -> {
            contador++;
            lblResultado.setText(String.valueOf(contador));
        });

        // Asociar evento con clase anónima
        /*btnReiniciar.setOnAction(new EventHandler<ActionEvent>() {
                                     @Override
                                     public void handle(ActionEvent event) {
                                         contador = 0;
                                         lblResultado.setText(String.valueOf(contador));
                                     }
                                 }
        );*/

        // Asociar evento con clase anónima PERO con lamda
        btnReiniciar.setOnAction( event -> {
            contador = 0;
            lblResultado.setText(String.valueOf(contador));
        });

        //Escena
        Scene scene = new Scene(vbox, 150, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
