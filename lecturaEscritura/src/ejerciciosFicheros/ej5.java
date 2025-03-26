package ejerciciosFicheros;

import java.io.*;
import java.util.*;

public class ej5 {
    public static void main(String[] args) {

        File a = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/alfabeto.txt");
        File ao = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/alfabetoOrdenado.txt");

        try {
            Scanner entrada = new Scanner(a);
            List<String> palabras = new ArrayList<>();

            while (entrada.hasNext()) {
                String palabra = entrada.next();
                palabras.add(palabra);
            }
            entrada.close();

            Collections.sort(palabras);


            PrintWriter salida = new PrintWriter(new FileWriter(ao));
            for (String palabra : palabras) {
                salida.print(palabra + " ");
            }

            salida.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
