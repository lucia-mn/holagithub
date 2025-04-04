package Lambda.act3und7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

interface Run {
    String correr(String nombre);
}

public class ej4 {

    public static void main(String[] args) {
        ArrayList<Parte> listaPartes = new ArrayList<>();

        String texto = "Vamos a crear un array";
        String[] palabras = texto.split(" ");

        Run uno = (nombre) -> "Vamos " + nombre;
        System.out.println(uno.correr("rápido"));

        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }


    public static class Parte {

    }
}
