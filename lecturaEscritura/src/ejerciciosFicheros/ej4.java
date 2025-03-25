package ejerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/espacios.txt");
        String texto;
        String cadena = "";
        Scanner entrada;

        try {
            entrada = new Scanner(f);
            while (entrada.hasNextLine()) {
                texto = entrada.nextLine();
                cadena += texto.replace(" ", "");
            }
            entrada.close();

            System.out.println("El resultado sin espacios y todo en mayúsculas sería: " + cadena.toUpperCase());
            entrada.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
