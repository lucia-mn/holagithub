/*
package ejerciciosFicheros;

import java.io.File;
import java.io.*;
import java.util.*;

public class ej8 {
    public static void main(String[] args) {
        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/ocurrenciasPalabras.txt");

        try {
            encontrarPalabra(f);
            System.out.println("La palabra " + );


        } catch (FileNotFoundException e) {
            System.out.println("MAL");
        }
    }


    //metodos
    private static void encontrarPalabra(File f) throws FileNotFoundException {

        Scanner entrada = new Scanner(f);
        Scanner scan = new Scanner(System.in);

        List<String> palabras = new ArrayList<>();

        System.out.println("Introduce la palabra que quieras buscar: ");
        String palabra = scan.nextLine();

        while (entrada.hasNext()) {
            palabra = entrada.next();
            palabras.add(palabra);
        }
        entrada.close();

        Collections.addAll(palabras);
        entrada.close();

        System.out.println("El texto es: " + palabras);
    }

    private static void palabraRepetida() {
        String palabra;

        for (int i = 1; i <= 2; i++) {
            palabra.println(i);
        }

        System.out.println("La palabra que se repite es: " + palabra);
    }
}
*/