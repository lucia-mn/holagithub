package ejerciciosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {

        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/mostrarArchivoPantalla.txt");

        try {
            mostrarArchivoPantalla(f);

        } catch (FileNotFoundException e) {
            System.out.println("MAL");
        }
    }

    //metodo
    private static void mostrarArchivoPantalla(File f) throws FileNotFoundException {

        Scanner entrada = new Scanner(f);
        List<String> palabras = new ArrayList<>();

        while (entrada.hasNext()) {
            String palabra = entrada.next();
            palabras.add(palabra);
        }
        entrada.close();

        Collections.addAll(palabras);
        entrada.close();

        System.out.println("El texto es: " + palabras);
    }
}
